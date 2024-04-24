package fr.eql.ai115.cda.hotel.paris.blue.app.service.impl;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Offer;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Room;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.RoomOccupation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.AvailableOfferGetDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.response.OfferResponseDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.OfferRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.RoomOccupationRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.RoomRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    RoomOccupationRepository roomOccupationRepository;

    @Autowired
    OfferRepository offerRepository;

    @Override
    public List<OfferResponseDto> getAvailableOffers(AvailableOfferGetDto availableOfferGetDto) {
        List<RoomOccupation> roomOccupations = roomOccupationRepository.findByOccupationStartBeforeAndOccupationEndAfter
                (availableOfferGetDto.getEndDate(), availableOfferGetDto.getStartDate());
        List<Offer> offers = offerRepository.findByOfferStartDateBeforeAndOfferEndDateAfter
                (availableOfferGetDto.getStartDate(), availableOfferGetDto.getStartDate());
        List<Room> rooms = roomRepository.findAll();
        rooms.removeIf(room -> roomOccupations.stream().anyMatch(roomOccupation -> roomOccupation.getRoom().equals(room)));
        offers.removeIf(offer -> !rooms.contains(offer.getRoom()));
        List<OfferResponseDto> offerResponseDtos = new ArrayList<>();
        for (Offer offer : offers) {
            OfferResponseDto offerResponseDto = getOfferResponseDto(offer);
            offerResponseDtos.add(offerResponseDto);
        }
        return offerResponseDtos;

    }

    private static OfferResponseDto getOfferResponseDto(Offer offer) {
        OfferResponseDto offerResponseDto = new OfferResponseDto();
        offerResponseDto.setOfferEndDate(offer.getOfferEndDate());
        offerResponseDto.setOfferStartDate(offer.getOfferStartDate());
        offerResponseDto.setNightlyRate(offer.getNightlyRate());
        offerResponseDto.setOfferId(offer.getOfferId());
        offerResponseDto.setRoomId(offer.getRoom().getRoomId());
        offerResponseDto.setCapacity(offer.getRoom().getCapacity());
        offerResponseDto.setRoomType(offer.getRoom().getRoomType());
        return offerResponseDto;
    }
}

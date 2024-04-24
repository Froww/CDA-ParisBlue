package fr.eql.ai115.cda.hotel.paris.blue.app.service;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Offer;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.AvailableOfferGetDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.response.OfferResponseDto;

import java.time.LocalDate;
import java.util.List;

public interface OfferService {
    List<OfferResponseDto> getAvailableOffers(AvailableOfferGetDto availableOfferGetDto);
}

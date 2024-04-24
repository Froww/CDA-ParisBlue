package fr.eql.ai115.cda.hotel.paris.blue.app.rest.controller;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Offer;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Room;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.AvailableOfferGetDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.response.OfferResponseDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/nonauth/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @GetMapping("/available")
    public List<OfferResponseDto> getAvailableOffers(@RequestBody AvailableOfferGetDto availableOfferGetDto) {
        return offerService.getAvailableOffers(availableOfferGetDto);
    }

}

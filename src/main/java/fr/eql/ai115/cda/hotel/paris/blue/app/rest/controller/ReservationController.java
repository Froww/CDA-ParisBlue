package fr.eql.ai115.cda.hotel.paris.blue.app.rest.controller;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationGetDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.response.ReservationResponseDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nonauth/reservation")
@CrossOrigin("${front.url}")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public Reservation addNonAuthReservation(@RequestBody ReservationAddDto reservationAddDto) {
        return reservationService.addNonAuthReservation(reservationAddDto);
    }

    @PostMapping("/get")
    public ReservationResponseDto getNonAuthReservation(@RequestBody ReservationGetDto reservationGetDto) {
        return reservationService.getNonAuthReservation(reservationGetDto);
    }
}

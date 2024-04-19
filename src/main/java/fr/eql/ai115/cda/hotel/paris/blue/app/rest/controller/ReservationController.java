package fr.eql.ai115.cda.hotel.paris.blue.app.rest.controller;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.ReservationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add/nonauth")
    public Reservation addNonAuthReservation(@RequestBody ReservationAddDto reservationAddDto) {
        return reservationService.addNonAuthReservation(reservationAddDto);
    }
}

package fr.eql.ai115.cda.hotel.paris.blue.app.service;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationGetDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.response.ReservationResponseDto;

public interface ReservationService {

    public Reservation addNonAuthReservation(ReservationAddDto reservationAddDto);

    public ReservationResponseDto getNonAuthReservation(ReservationGetDto reservationGetDto);
    public void cancelReservation();
    public void updateReservation();
}

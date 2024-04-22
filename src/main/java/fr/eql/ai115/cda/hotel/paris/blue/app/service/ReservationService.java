package fr.eql.ai115.cda.hotel.paris.blue.app.service;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationGetDto;

public interface ReservationService {

    public Reservation addNonAuthReservation(ReservationAddDto reservationAddDto);

    public Reservation getNonAuthReservation(ReservationGetDto reservationGetDto);
    public void cancelReservation();
    public void updateReservation();
}

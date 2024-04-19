package fr.eql.ai115.cda.hotel.paris.blue.app.service;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;

public interface ReservationService {

    public Reservation addNonAuthReservation(ReservationAddDto reservationAddDto);
    public void cancelReservation();
    public void updateReservation();
}

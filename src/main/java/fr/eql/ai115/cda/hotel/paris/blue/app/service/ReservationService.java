package fr.eql.ai115.cda.hotel.paris.blue.app.service;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;

public interface ReservationService {

    public void addNonAuthReservation(ReservationAddDto reservationAddDto);
    public void cancelReservation();
    public void updateReservation();
}

package fr.eql.ai115.cda.hotel.paris.blue.app.repository;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

package fr.eql.ai115.cda.hotel.paris.blue.app.repository;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.RoomOccupation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RoomOccupationRepository extends JpaRepository<RoomOccupation, Long> {
    List<RoomOccupation> findByOccupationStartBeforeAndOccupationEndAfter(LocalDate endDate, LocalDate startDate);
}

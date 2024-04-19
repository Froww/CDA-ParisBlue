package fr.eql.ai115.cda.hotel.paris.blue.app.repository;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.RoomOccupation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomOccupationRepository extends JpaRepository<RoomOccupation, Long> {
}

package fr.eql.ai115.cda.hotel.paris.blue.app.repository;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long>{

    List<Room> findAll();
}

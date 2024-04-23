package fr.eql.ai115.cda.hotel.paris.blue.app.service;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Room;

import java.time.LocalDate;
import java.util.List;

public interface RoomService {
    List<Room> getAvailableRooms(LocalDate startDate, LocalDate endDate);
}

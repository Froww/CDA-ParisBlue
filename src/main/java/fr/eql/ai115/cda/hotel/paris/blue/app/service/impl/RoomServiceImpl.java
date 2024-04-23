package fr.eql.ai115.cda.hotel.paris.blue.app.service.impl;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Room;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.RoomOccupation;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.RoomOccupationRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.RoomRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    RoomOccupationRepository roomOccupationRepository;

    @Override
    public List<Room> getAvailableRooms(LocalDate startDate, LocalDate endDate) {
        List<Room> rooms = roomRepository.findAll();
        List<RoomOccupation> occupiedRooms = roomOccupationRepository.findByOccupationStartBetweenAndOccupationEndBetween(startDate, endDate);
        for (RoomOccupation roomOccupation :occupiedRooms) {
            rooms.remove(roomOccupation.getRoom());
        }
        return rooms;
    }
}

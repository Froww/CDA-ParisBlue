package fr.eql.ai115.cda.hotel.paris.blue.app.rest.controller;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Room;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/nonauth/rooms")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAvailableRooms(null, null);
    }

}

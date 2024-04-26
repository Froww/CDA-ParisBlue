package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    private int roomNumber;
    private int capacity;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @JsonIgnore
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<RoomOccupation> roomOccupations;

    public Room() {

    }

    public Room(Long roomId, int roomNumber, int capacity, RoomType roomType, List<RoomOccupation> roomOccupations) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.roomOccupations = roomOccupations;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public List<RoomOccupation> getRoomOccupations() {
        return roomOccupations;
    }

    public void setRoomOccupations(List<RoomOccupation> roomOccupations) {
        this.roomOccupations = roomOccupations;
    }
}

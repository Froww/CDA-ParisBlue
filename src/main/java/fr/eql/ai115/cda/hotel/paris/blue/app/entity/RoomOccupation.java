package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class RoomOccupation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomOccupationId;
    private LocalDate occupationStart;
    private LocalDate occupationEnd;

    @ManyToOne
    @JoinColumn(referencedColumnName = "roomId")
    private Room room;

    public Long getRoomOccupationId() {
        return roomOccupationId;
    }

    public void setRoomOccupationId(Long roomOccupationId) {
        this.roomOccupationId = roomOccupationId;
    }

    public LocalDate getOccupationStart() {
        return occupationStart;
    }

    public void setOccupationStart(LocalDate occupationStart) {
        this.occupationStart = occupationStart;
    }

    public LocalDate getOccupationEnd() {
        return occupationEnd;
    }

    public void setOccupationEnd(LocalDate occupationEnd) {
        this.occupationEnd = occupationEnd;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class RoomOccupation {

    @Id
    private Long roomOccupationId;
    private LocalDate occupationStart;
    private LocalDate occupationEnd;

    @ManyToOne
    @JoinColumn(referencedColumnName = "roomId")
    private Room room;
}

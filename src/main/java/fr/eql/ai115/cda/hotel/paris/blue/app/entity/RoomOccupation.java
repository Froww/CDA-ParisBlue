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
}

package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private String reservationNumber;
    private LocalDateTime reservationDate;
    private LocalDate plannedCheckInDate;
    private LocalDate plannedCheckOutDate;
    private LocalDateTime actualCheckInDate;
    private LocalDateTime actualCheckOutDate;

    private LocalDateTime modificationDate;

    @Enumerated(EnumType.STRING)
    private CancellationReason cancellationReason;

    @ManyToOne
    @JoinColumn(referencedColumnName = "personId")
    private Person person;

    public Reservation() {
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getPlannedCheckInDate() {
        return plannedCheckInDate;
    }

    public void setPlannedCheckInDate(LocalDate plannedCheckInDate) {
        this.plannedCheckInDate = plannedCheckInDate;
    }

    public LocalDate getPlannedCheckOutDate() {
        return plannedCheckOutDate;
    }

    public void setPlannedCheckOutDate(LocalDate plannedCheckOutDate) {
        this.plannedCheckOutDate = plannedCheckOutDate;
    }

    public LocalDateTime getActualCheckInDate() {
        return actualCheckInDate;
    }

    public void setActualCheckInDate(LocalDateTime actualCheckInDate) {
        this.actualCheckInDate = actualCheckInDate;
    }

    public LocalDateTime getActualCheckOutDate() {
        return actualCheckOutDate;
    }

    public void setActualCheckOutDate(LocalDateTime actualCheckOutDate) {
        this.actualCheckOutDate = actualCheckOutDate;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(LocalDateTime modificationDate) {
        this.modificationDate = modificationDate;
    }

    public CancellationReason getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(CancellationReason cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

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
    private LocalDate plannedArrivalDate;
    private LocalDate plannedDepartureDate;
    private LocalDateTime actualCheckInDate;
    private LocalDateTime actualCheckOutDate;
    private LocalDateTime modificationDate;

    private LocalDateTime payementDate;

    @ManyToOne
    @JoinColumn(referencedColumnName = "offerId")
    private Offer offer;

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

    public LocalDate getPlannedArrivalDate() {
        return plannedArrivalDate;
    }

    public void setPlannedArrivalDate(LocalDate plannedArrivalDate) {
        this.plannedArrivalDate = plannedArrivalDate;
    }

    public LocalDate getPlannedDepartureDate() {
        return plannedDepartureDate;
    }

    public void setPlannedDepartureDate(LocalDate plannedDepartureDate) {
        this.plannedDepartureDate = plannedDepartureDate;
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

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public LocalDateTime getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(LocalDateTime payementDate) {
        this.payementDate = payementDate;
    }
}



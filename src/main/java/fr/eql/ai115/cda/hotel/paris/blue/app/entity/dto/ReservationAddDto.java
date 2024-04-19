package fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Offer;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReservationAddDto {

    private Person person;
    private Offer offer;
    private LocalDate plannedArrival;
    private LocalDate plannedDeparture;
    private LocalDateTime payementDate;
    private LocalDateTime reservationDate;

    public ReservationAddDto() {
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

    public LocalDate getPlannedArrival() {
        return plannedArrival;
    }

    public void setPlannedArrival(LocalDate plannedArrival) {
        this.plannedArrival = plannedArrival;
    }

    public LocalDate getPlannedDeparture() {
        return plannedDeparture;
    }

    public void setPlannedDeparture(LocalDate plannedDeparture) {
        this.plannedDeparture = plannedDeparture;
    }

    public LocalDateTime getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(LocalDateTime payementDate) {
        this.payementDate = payementDate;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }
}

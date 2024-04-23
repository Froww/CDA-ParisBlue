package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;

    private LocalDate offerStartDate;
    private LocalDate offerEndDate;
    private double nightlyRate;

    @ManyToOne
    @JoinColumn(referencedColumnName = "roomId")
    private Room room;

    @JsonIgnore
    @OneToMany(mappedBy = "offer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    public Offer() {
    }

    public Offer(Long offerId, LocalDate offerStartDate, LocalDate offerEndDate, double nightlyRate, Room room) {
        this.offerId = offerId;
        this.offerStartDate = offerStartDate;
        this.offerEndDate = offerEndDate;
        this.nightlyRate = nightlyRate;
        this.room = room;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public LocalDate getOfferStartDate() {
        return offerStartDate;
    }

    public void setOfferStartDate(LocalDate offerStartDate) {
        this.offerStartDate = offerStartDate;
    }

    public LocalDate getOfferEndDate() {
        return offerEndDate;
    }

    public void setOfferEndDate(LocalDate offerEndDate) {
        this.offerEndDate = offerEndDate;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}

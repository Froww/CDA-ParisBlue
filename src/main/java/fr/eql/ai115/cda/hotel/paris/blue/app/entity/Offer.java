package fr.eql.ai115.cda.hotel.paris.blue.app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

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
}

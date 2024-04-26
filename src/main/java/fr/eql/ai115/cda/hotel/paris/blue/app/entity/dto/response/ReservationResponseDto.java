package fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.response;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.RoomType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReservationResponseDto {
    private String reservationNumber;
    private LocalDateTime reservationDate;
    private LocalDate plannedArrivalDate;
    private LocalDate plannedDepartureDate;
    private LocalDateTime payementDate;
    private double nightlyRate;
    private int roomNumber;
    private RoomType roomType;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    public ReservationResponseDto() {
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

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public LocalDateTime getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(LocalDateTime payementDate) {
        this.payementDate = payementDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

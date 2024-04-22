package fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto;

public class ReservationGetDto {

        private String reservationNumber;
        private String lastname;
        private String email;

        public ReservationGetDto() {
        }

        public ReservationGetDto(String reservationNumber, String lastname, String email) {
            this.reservationNumber = reservationNumber;
            this.lastname = lastname;
            this.email = email;
        }

        public String getReservationNumber() {
            return reservationNumber;
        }

        public void setReservationNumber(String reservationNumber) {
            this.reservationNumber = reservationNumber;
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
}

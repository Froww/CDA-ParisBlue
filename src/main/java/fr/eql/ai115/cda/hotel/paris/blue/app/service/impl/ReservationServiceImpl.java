package fr.eql.ai115.cda.hotel.paris.blue.app.service.impl;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Person;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Reservation;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationAddDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto.ReservationGetDto;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.AccountRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.PersonRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.repository.ReservationRepository;
import fr.eql.ai115.cda.hotel.paris.blue.app.service.ReservationService;
import org.springframework.stereotype.Service;


@Service
public class ReservationServiceImpl implements ReservationService {

    private final PersonRepository personRepository;
    private final AccountRepository accountRepository;
    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(PersonRepository personRepository, AccountRepository accountRepository, ReservationRepository reservationRepository) {
        this.personRepository = personRepository;
        this.accountRepository = accountRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation addNonAuthReservation(ReservationAddDto reservationAddDto) {
        Person reservationPerson = personRepository.findByFirstnameAndLastnameAndEmail(reservationAddDto.getPerson().getFirstname(),
                reservationAddDto.getPerson().getLastname(), reservationAddDto.getPerson().getEmail());
        if(reservationPerson == null) {
            reservationPerson =  personRepository.save(reservationAddDto.getPerson());
        }
        Reservation reservation = new Reservation();
        reservation.setPerson(reservationPerson);
        reservation.setOffer(reservationAddDto.getOffer());
        reservation.setPlannedArrivalDate(reservationAddDto.getPlannedArrival());
        reservation.setPlannedDepartureDate(reservationAddDto.getPlannedDeparture());
        reservation.setPayementDate(reservationAddDto.getPayementDate());
        reservation.setReservationDate(reservationAddDto.getReservationDate());
        reservationRepository.save(reservation);
        return reservation;
    }

    @Override
    public Reservation getNonAuthReservation(ReservationGetDto reservationGetDto) {
        return reservationRepository.findReservationByReservationNumberAndPersonLastnameAndPersonEmail(
                reservationGetDto.getReservationNumber(),
                reservationGetDto.getLastname(), reservationGetDto.getEmail());
    }

    @Override
    public void cancelReservation() {

    }

    @Override
    public void updateReservation() {

    }
}

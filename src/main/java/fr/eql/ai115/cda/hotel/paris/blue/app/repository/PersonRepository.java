package fr.eql.ai115.cda.hotel.paris.blue.app.repository;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByFirstnameAndLastnameAndEmail(String firstname, String lastname, String email);
}

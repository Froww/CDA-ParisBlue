package fr.eql.ai115.cda.hotel.paris.blue.app.repository;

import fr.eql.ai115.cda.hotel.paris.blue.app.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer, Long>{

}

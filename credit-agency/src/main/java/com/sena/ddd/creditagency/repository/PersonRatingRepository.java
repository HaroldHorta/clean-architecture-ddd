package com.sena.ddd.creditagency.repository;

import com.sena.ddd.creditagency.model.PersonRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;


public interface PersonRatingRepository extends JpaRepository<PersonRating, Long> {
	@Query("SELECT max(pr.lastUpdated) FROM PersonRating pr")
	Date lastUpdate();

}

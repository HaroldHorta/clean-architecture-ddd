package com.sena.ddd.creditagency.repository;

import com.sena.ddd.creditagency.model.PersonRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface PersonRatingRespository extends JpaRepository <PersonRating, Long> {

    @Query("select  max (pr.lastUpdated) from PersonRating pr")
    Date lastupdate();
}

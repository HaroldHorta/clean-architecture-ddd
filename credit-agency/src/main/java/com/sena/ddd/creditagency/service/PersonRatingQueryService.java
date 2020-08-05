package com.sena.ddd.creditagency.service;

import com.sena.ddd.creditagency.model.PersonRating;
import com.sena.ddd.creditagency.repository.PersonRatingRespository;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonRatingQueryService {

    private final PersonRatingRespository personRatingRespository;

    public PersonRatingQueryService(PersonRatingRespository personRatingRespository) {
        this.personRatingRespository = personRatingRespository;
    }

    public void ratePerson(String firstName, String lastName, String street, String postCode, String city){
        PersonRating rating= new PersonRating();

        rating.setCity(city);
        rating.setFirstName(firstName);
        rating.setLastName(firstName);
        rating.setPostCode(postCode);
        rating.setStreet(street);
        rating.setPoints(100);
        rating.setLastUpdated(new Date());
        GregorianCalendar gregorianCalendar= new GregorianCalendar();
        gregorianCalendar.add(Calendar.MONTH, 1);
        rating.setValidTo(gregorianCalendar.getTime());

        personRatingRespository.save(rating);

    }
}

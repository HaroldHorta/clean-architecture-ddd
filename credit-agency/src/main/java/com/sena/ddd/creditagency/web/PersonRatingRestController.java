package com.sena.ddd.creditagency.web;


import com.sena.ddd.creditagency.model.PersonRating;
import com.sena.ddd.creditagency.repository.PersonRatingRespository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rating/rest")
public class PersonRatingRestController {

    private final PersonRatingRespository personRatingRespository;

    public PersonRatingRestController(PersonRatingRespository personRatingRespository) {
        this.personRatingRespository = personRatingRespository;
    }

    public PersonRating index (@PathVariable Long ratingId){
        return personRatingRespository.findById(ratingId).get();
    }
}

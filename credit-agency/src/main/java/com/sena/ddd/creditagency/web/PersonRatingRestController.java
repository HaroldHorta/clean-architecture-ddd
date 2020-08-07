package com.sena.ddd.creditagency.web;

import com.sena.ddd.creditagency.model.PersonRating;
import com.sena.ddd.creditagency.repository.PersonRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rating/rest")
public class PersonRatingRestController {
	private PersonRatingRepository personRatingRepository;

	@Autowired
	public PersonRatingRestController(PersonRatingRepository personRatingRepository) {
		this.personRatingRepository = personRatingRepository;
	}

	@GetMapping("/{ratingId}")
	public PersonRating index(Model model, @PathVariable Long ratingId) {
		return personRatingRepository.findById(ratingId).get();
	}
}

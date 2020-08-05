package com.sena.ddd.creditagency.web;

import com.sena.ddd.creditagency.repository.PersonRatingRespository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("person-rating")
public class PersonRatingController {

    private final PersonRatingRespository personRatingRespository;

    public PersonRatingController(PersonRatingRespository personRatingRespository) {
        this.personRatingRespository = personRatingRespository;
    }

    @RequestMapping(value = "/feed", produces = "application/atom+xml")
    public ModelAndView orderFeed (WebRequest webRequest, HttpServletResponse response){
        Date lastUpdate = personRatingRespository.lastupdate();

        if(lastUpdate != null ){
            response.setDateHeader("Last-Modified", lastUpdate.getTime());
        }

        Sort sort = Sort.by(Sort.Direction.ASC, "lastUpdated");

        return new ModelAndView(new PersonRatingAtomFeedView(personRatingRespository),
                "personRatings", personRatingRespository.findAll(sort));
    }
}

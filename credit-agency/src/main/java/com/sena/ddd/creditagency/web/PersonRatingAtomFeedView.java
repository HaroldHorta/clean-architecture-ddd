package com.sena.ddd.creditagency.web;

import com.rometools.rome.feed.atom.Entry;
import com.sena.ddd.creditagency.repository.PersonRatingRespository;
import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class PersonRatingAtomFeedView extends AbstractAtomFeedView {

    private final PersonRatingRespository personRatingRespository;

    public PersonRatingAtomFeedView(PersonRatingRespository personRatingRespository) {
        this.personRatingRespository = personRatingRespository;
    }

    protected 


    @Override
    protected List<Entry> buildFeedEntries(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }
}

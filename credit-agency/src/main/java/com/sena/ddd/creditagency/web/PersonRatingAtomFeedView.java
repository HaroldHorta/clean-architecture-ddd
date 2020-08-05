package com.sena.ddd.creditagency.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rometools.rome.feed.atom.*;
import com.rometools.rome.feed.synd.SyndPerson;
import com.sena.ddd.creditagency.model.PersonRating;
import com.sena.ddd.creditagency.repository.PersonRatingRespository;
import org.springframework.data.domain.Sort;
import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonRatingAtomFeedView extends AbstractAtomFeedView {

    private final PersonRatingRespository personRatingRespository;

    public PersonRatingAtomFeedView(PersonRatingRespository personRatingRespository) {
        this.personRatingRespository = personRatingRespository;
    }

    @Override
    protected void buildFeedMetadata (Map<String , Object> model, Feed feed, HttpServletRequest request ){
        feed.setId("https://github.com/HaroldHorta/clean-architecture-ddd/credit-agency");
        feed.setTitle("Credit Agency Ratings");
        List<Link> alternativesLinks = new ArrayList<>();
        Link link = new Link();
        link.setRel("self");
        link.setHref(baseUrl(request));
        alternativesLinks.add(link);
        List<SyndPerson> authors = new ArrayList<>();
        Person person = new Person();
        person.setName("Big Pug Bank");
        authors.add(person);
        feed.setAuthors(authors);

        feed.setAlternateLinks(alternativesLinks);
        feed.setUpdated(personRatingRespository.lastupdate());
        Content subtitle = new Content();
        subtitle.setValue("List of all valid person ratings");
        feed.setSubtitle(subtitle);

    }

    private String baseUrl(HttpServletRequest request) {
        return String.format("%s://%s:%d%s/", request.getScheme(), request.getServerName(), request.getServerPort(),
                request.getContextPath());
    }

    @Override
    protected List<Entry> buildFeedEntries(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       List<Entry> entries = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();

        for (PersonRating personRating : personRatingRespository.findAll(Sort.by(Sort.Direction.DESC, "lastUpdated"))){
            Entry entry = new Entry();
            entry.setId("https://github.com/HaroldHorta/clean-architecture-ddd/person-rating/" + personRating.getId());
            entry.setUpdated(personRating.getLastUpdated());
            entry.setTitle("Person Rating" + personRating.getId());

            List<Content> contents = new ArrayList<>();
            Content content = new Content();
            content.setSrc(baseUrl(httpServletRequest) + "rating/rest/" + personRating.getId());
            content.setType("application/json");

            contents.add(content);
            entry.setContents(contents);
            Content summary = new Content();
            summary.setValue(mapper.writeValueAsString(personRating));
            entry.setSummary(summary);
            entries.add(entry);

        }

        return entries;
    }
}

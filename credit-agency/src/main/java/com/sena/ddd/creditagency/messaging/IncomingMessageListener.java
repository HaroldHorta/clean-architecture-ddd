package com.sena.ddd.creditagency.messaging;

import com.sena.ddd.creditagency.event.incoming.ApplicationSubmittedEvent;
import com.sena.ddd.creditagency.event.incoming.applicant.Applicant;
import com.sena.ddd.creditagency.service.PersonRatingQueryService;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

public class IncomingMessageListener {

    private final PersonRatingQueryService personRatingQueryService;

    public IncomingMessageListener(PersonRatingQueryService personRatingQueryService) {
        this.personRatingQueryService = personRatingQueryService;
    }

    @StreamListener(CreditAgencyChannels.APPLICATION_SUBMITTED)
    public void receiveApplicationSubmission (@Payload ApplicationSubmittedEvent applicationSubmittedEvent){
        Applicant applicant = applicationSubmittedEvent.getFirstApplicant();

        personRatingQueryService.ratePerson(applicant.getFirstName(),
                applicant.getLastName(),
                applicant.getAddress().getStreet(),
                applicant.getAddress().getPostCode(),
                applicant.getAddress().getCity());
    }
}

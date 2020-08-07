package com.sena.ddd.creditagency.messaging;

import com.sena.ddd.creditagency.events.incoming.ApplicationSubmittedEvent;
import com.sena.ddd.creditagency.events.incoming.applicant.Applicant;
import com.sena.ddd.creditagency.service.PersonRatingQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class IncomingMessageListener {

	private PersonRatingQueryService personRatingQueryService;

	@Autowired
	public IncomingMessageListener(PersonRatingQueryService personRatingQueryService) {
		this.personRatingQueryService = personRatingQueryService;
	}

	@StreamListener(CreditAgencyChannels.APPLICATION_SUBMITTED)
	public void receiveApplicationSubmission(@Payload ApplicationSubmittedEvent applicationSubmittedEvent) {

		System.out.println("received " + applicationSubmittedEvent.getFirstApplicant().toString());
		Applicant applicant = applicationSubmittedEvent.getFirstApplicant();
		personRatingQueryService.ratePerson(applicant.getFirstName(),
				applicant.getLastName(),
				applicant.getAddress().getStreet(),
				applicant.getAddress().getPostCode(),
				applicant.getAddress().getCity());
	}


}

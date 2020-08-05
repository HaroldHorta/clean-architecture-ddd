package com.sena.ddd.creditagency.event.incoming;

import com.sena.ddd.creditagency.event.incoming.applicant.Applicant;

public class ApplicationSubmittedEvent {

    private String applicationNumber;
    private Applicant firstApplicant;

    public ApplicationSubmittedEvent() {
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Applicant getFirstApplicant() {
        return firstApplicant;
    }

    public void setFirstApplicant(Applicant firstApplicant) {
        this.firstApplicant = firstApplicant;
    }
}

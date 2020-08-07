package com.sena.ddd.creditsalesfunnel.model;

import com.sena.ddd.creditsalesfunnel.model.applicant.Applicant;
import com.sena.ddd.creditsalesfunnel.model.financing.Financing;
import com.sena.ddd.creditsalesfunnel.model.household.Household;
import com.sena.ddd.creditsalesfunnel.model.realEstate.RealEstateProperty;

public class CreditApplicationForm {

    private String applicationNumber;

    private Applicant firstApplicant;
    private Applicant secondApplicant;
    private RealEstateProperty realEstateProperty;
    private Household householdInformation;
    private Financing financing;

    public Applicant getFirstApplicant() {
        return firstApplicant;
    }

    public void setFirstApplicant(Applicant firstApplicant) {
        this.firstApplicant = firstApplicant;
    }

    public Applicant getSecondApplicant() {
        return secondApplicant;
    }

    public void setSecondApplicant(Applicant secondApplicant) {
        this.secondApplicant = secondApplicant;
    }

    public RealEstateProperty getRealEstateProperty() {
        return realEstateProperty;
    }

    public void setRealEstateProperty(RealEstateProperty realEstateProperty) {
        this.realEstateProperty = realEstateProperty;
    }

    public Household getHouseholdInformation() {
        return householdInformation;
    }

    public void setHouseholdInformation(Household householdInformation) {
        this.householdInformation = householdInformation;
    }

    public Financing getFinancing() {
        return financing;
    }

    public void setFinancing(Financing financing) {
        this.financing = financing;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }
}

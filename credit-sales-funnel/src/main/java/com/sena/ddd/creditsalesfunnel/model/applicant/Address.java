package com.sena.ddd.creditsalesfunnel.model.applicant;


import com.sena.ddd.creditsalesfunnel.model.validation.ApplicationSubmissionGroup;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String street;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String postCode;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

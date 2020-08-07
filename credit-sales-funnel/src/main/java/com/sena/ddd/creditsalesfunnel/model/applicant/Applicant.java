package com.sena.ddd.creditsalesfunnel.model.applicant;

import com.sena.ddd.creditsalesfunnel.model.validation.ApplicationSubmissionGroup;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Applicant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long databaseId;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String applicationNumber;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String applicantNumber;

    private String customerNumber;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String firstName;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    @NotEmpty(groups = ApplicationSubmissionGroup.class)
    private String lastName;

    @Embedded
    @Valid
    @NotNull(groups = ApplicationSubmissionGroup.class)
    private Address address;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    private MaritalStatus maritalStatus;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    private Business business;

    @NotNull(groups = ApplicationSubmissionGroup.class)
    private Employment employment;

    private String employer;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employedSince;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(groups = ApplicationSubmissionGroup.class)
    private Date birthday;

    public Applicant(String applicationNumber, String applicantNumber){
        this.address= new Address();

        this.applicationNumber = applicationNumber;
        this.applicantNumber = applicantNumber;
    }


}

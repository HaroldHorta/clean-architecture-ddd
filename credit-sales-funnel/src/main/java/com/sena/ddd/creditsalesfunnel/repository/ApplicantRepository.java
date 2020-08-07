package com.sena.ddd.creditsalesfunnel.repository;

import com.sena.ddd.creditsalesfunnel.model.applicant.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    Applicant findByApplicAndApplicationNumberAndApplicantNumber(String applicationNumber, String applicantNumber);

    List<Applicant> findByApplicationNumberOrderByApplicantNumber(String applicationNumber);

}

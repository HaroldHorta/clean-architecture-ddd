package com.sena.ddd.creditsalesfunnel.repository;

import com.sena.ddd.creditsalesfunnel.model.household.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdRepository extends JpaRepository<Household, Long> {
    Household findByApplicationNumber(String applicationNumber);
}


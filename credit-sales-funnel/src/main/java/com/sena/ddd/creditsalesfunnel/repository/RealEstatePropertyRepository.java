package com.sena.ddd.creditsalesfunnel.repository;

import com.sena.ddd.creditsalesfunnel.model.realEstate.RealEstateProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealEstatePropertyRepository extends JpaRepository<RealEstateProperty, Long> {
    RealEstateProperty findByApplicationNumber(String applicationNumber);
}

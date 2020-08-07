package com.sena.ddd.creditsalesfunnel.repository;

import com.sena.ddd.creditsalesfunnel.model.financing.Financing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancingRepository extends JpaRepository<Financing, Long> {

    Financing findByApplicationNumber(String applicationNumber);

}

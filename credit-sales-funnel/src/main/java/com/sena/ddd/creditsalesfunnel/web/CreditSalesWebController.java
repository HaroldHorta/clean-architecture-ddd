package com.sena.ddd.creditsalesfunnel.web;

import com.sena.ddd.creditsalesfunnel.event.CreditSalesFunnelChannels;
import com.sena.ddd.creditsalesfunnel.repository.ApplicantRepository;
import com.sena.ddd.creditsalesfunnel.repository.FinancingRepository;
import com.sena.ddd.creditsalesfunnel.repository.HouseholdRepository;
import com.sena.ddd.creditsalesfunnel.repository.RealEstatePropertyRepository;
import org.springframework.stereotype.Controller;

@Controller
public class CreditSalesWebController {

  private final ApplicantRepository applicantRepository;
  private final FinancingRepository financingRepository;
  private final HouseholdRepository householdRepository;
  private final RealEstatePropertyRepository realEstatePropertyRepository;
  private final CreditSalesFunnelChannels creditSalesFunnelChannels;

  public CreditSalesWebController(ApplicantRepository applicantRepository, FinancingRepository financingRepository,
                                  HouseholdRepository householdRepository, RealEstatePropertyRepository realEstatePropertyRepository,
                                  CreditSalesFunnelChannels creditSalesFunnelChannels) {
    this.applicantRepository = applicantRepository;
    this.financingRepository = financingRepository;
    this.householdRepository = householdRepository;
    this.realEstatePropertyRepository = realEstatePropertyRepository;
    this.creditSalesFunnelChannels = creditSalesFunnelChannels;
  }
}

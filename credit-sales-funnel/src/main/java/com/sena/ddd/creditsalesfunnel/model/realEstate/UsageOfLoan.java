package com.sena.ddd.creditsalesfunnel.model.realEstate;

public enum UsageOfLoan {
	PURCHASE("Purchase"),
	CONSTRUCTION("Construction"),
	MODERNIZATION("Modernization"),
	OTHER("Other");

	private final String displayName;

	UsageOfLoan(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

package com.sena.ddd.creditsalesfunnel.model.realEstate;

public enum TypeOfUse {
	FOR_LEASE("For lease"),
	SELF_OCCUPIED("Self occupied"),
	COMMERCIAL("Commercial");

	private final String displayName;

	TypeOfUse(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

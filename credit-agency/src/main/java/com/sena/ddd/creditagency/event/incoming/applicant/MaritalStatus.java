package com.sena.ddd.creditagency.event.incoming.applicant;

public enum MaritalStatus {
	SINGLE("Single"),
	MARRIED("Married"),
	DIVORCED("Divorced"),
	WIDOWED("Widowed");

	private final String displayName;

	MaritalStatus(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

package com.xyzstaffing.domain;

public enum USState {
	
	AL("Alabama"),
	AK("Alaska"),
	AS("American Samoa"),
	AZ("Arizona"),
	AR("Arkansas"),
	CA("California"),
	CO("Colorado"),
	CT("Connecticut"),
	DE("Delaware"),
	DC("District of Columbia"),
	FL("Florida"),
	GA("Georgia"),
	GU("Guam"),
	HI("Hawaii"),
	ID("Idaho"),
	IL("Illinois"),
	IN("Indiana"),
	IA("Iowa"),
	KS("Kansas"),
	KY("Kentucky"),
	LA("Louisiana"),
	ME("Maine"),
	MD("Maryland"),
	MH("Marshal Islands"),
	MA("Massachusetts"),
	MI("Michigan"),
	FM("Micronesia"),
	MN("Minnesota"),
	MS("Mississippi"),
	MO("Missouri"),
	MT("Montana"),
	NE("Nebraska"),
	NV("Nevada"),
	NH("New Hampshire"),
	NJ("New Jersey"),
	NM("New Mexico"),
	NY("New York"),
	NC("North Carolina"),
	ND("North Dakota"),
	MP("Northern Marianas"),
	OH("Ohio"),
	OK("Oklahoma"),
	OR("Oregon"),
	PW("Palau"),
	PA("Pennsylvania"),
	PR("Puerto Rico"),
	RI("Rhode Island"),
	SC("South Carolina"),
	SD("South Dakota"),
	TN("Tennessee"),
	TX("Texas"),
	UT("Utah"),
	VT("Vermont"),
	VA("Virgina"),
	VI("Virgin Islands"),
	WA("Washington"),
	WV("West Virginia"),
	WI("Wisconsin"),
	WY("Wyoming");
	
	private String fullName;

	private USState(String fullName) {
		this.fullName= fullName;
	}
	
	@Override
	public String toString() {
		return fullName;
	}
}

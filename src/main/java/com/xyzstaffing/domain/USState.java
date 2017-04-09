package com.xyzstaffing.domain;

public enum USState {
	IA("Iowa"),
	IL("Illinois");
	
	private String fullName;

	private USState(String fullName) {
		this.fullName= fullName;
	}
	
	@Override
	public String toString() {
		return fullName;
	}
}

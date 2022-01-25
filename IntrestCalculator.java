package com.bank;

public final class IntrestCalculator {
	private double pamount;
	private float rate;
	private int terms;
	public IntrestCalculator(double pamount, float rate, int terms) {
		this.pamount = pamount;
		this.rate = rate;
		this.terms = terms;
	}
	public float intrAmount() {
		return (float) (pamount*rate*terms/100);
	}
	

}

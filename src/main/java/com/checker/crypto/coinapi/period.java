package com.checker.crypto.coinapi;

public class period {

	private PERIOD_IDENTIFIER period_id; // Period identifier, used in other
											// API calls
	private int length_seconds; // Seconds part of period length
	private int length_months; // Months part of period length
	private int unit_count; // Period length in units
	private String unit_name; // Type of unit
								// (second/minute/hour/day/month/year)
	private String display_name; // Display name of period length

	public period(PERIOD_IDENTIFIER period_id, int length_seconds, int length_months, int unit_count,
			String unit_name, String display_name) {
		this.period_id = period_id;
		this.length_seconds = length_seconds;
		this.length_months = length_months;
		this.unit_count = unit_count;
		this.unit_name = unit_name;
		this.display_name = display_name;
	}

	public PERIOD_IDENTIFIER get_period_id() {
		return period_id;
	}

	public int get_length_seconds() {
		return length_seconds;
	}

	public int get_length_months() {
		return length_months;
	}

	public int get_unit_count() {
		return unit_count;
	}

	public String get_unit_name() {
		return unit_name;
	}

	public String get_display_name() {
		return display_name;
	}

}

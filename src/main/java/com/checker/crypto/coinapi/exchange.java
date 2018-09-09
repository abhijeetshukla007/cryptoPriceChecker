package com.checker.crypto.coinapi;

public class exchange {

	private String exchange_id; // Our exchange identifier
	private String name; // Display name of the exchange
	private String website; // Exchange website address

	public exchange(String exchange_id, String name, String website) {
		this.exchange_id = exchange_id;
		this.name = name;
		this.website = website;
	}

	public String get_exchange_id() {
		return exchange_id;
	}

	public String get_name() {
		return name;
	}

	public String get_website() {
		return website;
	}

}

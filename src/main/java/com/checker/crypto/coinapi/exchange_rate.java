package com.checker.crypto.coinapi;

import java.sql.Timestamp;

public class exchange_rate {
	private Timestamp time; // Time in ISO 8601 of the market data used to
	// calculate exchange rate
	private String asset_id_base; // Exchange rate base asset identifier
	private String asset_id_quote; // Exchange rate quote asset identifier
	private double rate; // Exchange rate between assets

	public exchange_rate(Timestamp time, String asset_id_base, String asset_id_quote, double rate) {
		this.time = time;
		this.asset_id_base = asset_id_base;
		this.asset_id_quote = asset_id_quote;
		this.rate = rate;
	}

	public Timestamp get_time() {
		return time;
	}

	public String get_asset_id_base() {
		return asset_id_base;
	}

	public String get_asset_id_quote() {
		return asset_id_quote;
	}

	public double get_rate() {
		return rate;
	}

}

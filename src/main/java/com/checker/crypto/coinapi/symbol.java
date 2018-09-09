package com.checker.crypto.coinapi;

import java.sql.Timestamp;

import com.checker.crypto.coinapi.java_rest_coin_api.OPTION_EXERCISE_STYLE;

public class symbol {

	private String symbol_id; // Our symbol identifier, see table below for
								// format description.
	private String exchange_id; // Our identifier of the exchange where
								// symbol is traded.
	private SYMBOL_TYPE symbol_type; // Type of symbol (possible values are:
										// SPOT, FUTURES or OPTION)
	private String asset_id_base; // FX Spot base asset identifier, for
									// derivatives it's contact underlying
									// (e.g. BTC for BTC/USD)
	private String asset_id_quote; // FX Spot quote asset identifier, for
									// derivatives it's contract underlying
									// (e.g. USD for BTC/USD)
	private boolean option_type_is_call; // Boolean value representing
											// option type. true for Call
											// options, false for Put
											// options
	private double option_strike_price; // Price at which option contract
										// can be exercised
	private double option_contract_unit; // Base asset amount of underlying
											// spot which single option
											// represents
	private OPTION_EXERCISE_STYLE option_exercise_style; // Option exercise
															// style. Can be
															// EUROPEAN or
															// AMERICAN
	private Timestamp option_expiration_time; // Option contract expiration
												// time in ISO 8601
	private Timestamp future_delivery_time; // Predetermined time of futures
											// contract delivery date in ISO
											// 8601

	public symbol(String symbol_id, String exchange_id, SYMBOL_TYPE symbol_type, String asset_id_base,
			String asset_id_quote, boolean option_type_is_call, double option_strike_price,
			double option_contract_unit, OPTION_EXERCISE_STYLE option_exercise_style,
			Timestamp option_expiration_time, Timestamp future_delivery_time) {

		this.symbol_id = symbol_id;
		this.exchange_id = exchange_id;
		this.symbol_type = symbol_type;
		this.asset_id_base = asset_id_base;
		this.asset_id_quote = asset_id_quote;
		this.option_type_is_call = option_type_is_call;
		this.option_strike_price = option_strike_price;
		this.option_contract_unit = option_contract_unit;
		this.option_exercise_style = option_exercise_style;
		this.option_expiration_time = option_expiration_time;
		this.future_delivery_time = future_delivery_time;
	}

	public symbol(String symbol_id, String exchange_id, SYMBOL_TYPE symbol_type, String asset_id_base,
			String asset_id_quote) {
		this.symbol_id = symbol_id;
		this.exchange_id = exchange_id;
		this.symbol_type = symbol_type;
		this.asset_id_base = asset_id_base;
		this.asset_id_quote = asset_id_quote;
		this.option_type_is_call = false;
		this.option_strike_price = 0.0;
		this.option_contract_unit = 0.0;
		this.option_exercise_style = OPTION_EXERCISE_STYLE.INVALID;
		this.option_expiration_time = null;
		this.future_delivery_time = null;
	}

	public String get_symbol_id() {
		return symbol_id;
	}

	public String get_exchange_id() {
		return exchange_id;
	}

	public SYMBOL_TYPE get_symbol_type() {
		return symbol_type;
	}

	public String get_asset_id_base() {
		return asset_id_base;
	}

	public String get_asset_id_quote() {
		return asset_id_quote;
	}

	public boolean get_option_type_is_call() {
		return option_type_is_call;
	}

	public double get_option_strike_price() {
		return option_strike_price;
	}

	public double get_option_contract_unit() {
		return option_contract_unit;
	}

	public OPTION_EXERCISE_STYLE get_option_exercise_style() {
		return option_exercise_style;
	}

	public Timestamp get_option_expiration_time() {
		return option_expiration_time;
	}

	public Timestamp get_future_delivery_time() {
		return future_delivery_time;
	}

}

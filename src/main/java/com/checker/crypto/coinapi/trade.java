package com.checker.crypto.coinapi;

import java.sql.Timestamp;

import com.checker.crypto.coinapi.java_rest_coin_api.TRADE_SIDE;

public class trade {

	private String symbol_id; // Our symbol identifier
	private Timestamp time_exchange; // Time of trade reported by exchange
	private Timestamp time_coinapi; // Time when coinapi first received
									// trade from exchange
	private String uuid; // Our trade unique identifier in form of UUIDv4
	private double price; // Price of the transaction
	private double size; // Base asset amount traded in the transaction
	private TRADE_SIDE taker_side; // Aggressor side of the transaction
									// (BUY/SELL/BUY_ESTIMATED/SELL_ESTIMATED/UNKNOWN)

	public trade(String symbol_id, Timestamp time_exchange, Timestamp time_coinapi, String uuid, double price,
			double size, TRADE_SIDE taker_side) {
		this.symbol_id = symbol_id;
		this.time_exchange = time_exchange;
		this.time_coinapi = time_coinapi;
		this.uuid = uuid;
		this.price = price;
		this.size = size;
		this.taker_side = taker_side;
	}

	public String get_symbol_id() {
		return symbol_id;
	}

	public Timestamp get_time_exchange() {
		return time_exchange;
	}

	public Timestamp get_time_coinapi() {
		return time_coinapi;
	}

	public String get_uuid() {
		return uuid;
	}

	public double get_price() {
		return price;
	}

	public double get_size() {
		return size;
	}

	public TRADE_SIDE get_taker_side() {
		return taker_side;
	}

}

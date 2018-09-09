/**
 * 
 */
package com.checker.crypto.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import org.springframework.stereotype.Service;

import com.checker.crypto.coinapi.PERIOD_IDENTIFIER;
import com.checker.crypto.coinapi.java_rest_coin_api;
import com.checker.crypto.dto.Timedata;
import com.checker.crypto.service.CryptoAnalyticService;

/**
 * @author Abhijeet
 *
 */
@Service
public class CryptoAnalyticServiceImpl implements CryptoAnalyticService {
	private static final String KEY = "5D18057D-1B61-461D-9B3F-B6420856A6F5";
	private String symbolId = "QUOINE_SPOT_BTC_INR";

	@Override
	public void getAveragePrices(Timestamp startTime, Timestamp endTime) throws Exception {
		java_rest_coin_api api = new java_rest_coin_api(KEY);
		System.out.println(api.ohlcv_get_historical_timeseries(symbolId, PERIOD_IDENTIFIER._1MIN,
				new Timestamp(116, 10, 1, 22, 8, 41, 0)));

	}

	@Override
	public double getAveragePrices2(Timestamp startTime, Timestamp endTime) throws Exception {
		java_rest_coin_api api = new java_rest_coin_api(KEY);
		Timedata[] result = api.ohlcv_get_historical_timeseries(symbolId, PERIOD_IDENTIFIER._1MIN, startTime, endTime);
		ArrayList<Timedata> timedatas = new ArrayList<>(Arrays.asList(result));

		return timedatas.stream().collect(Collectors.averagingDouble(Timedata::get_price_close));

	}

	@Override
	public double getAveragePricesforLastMinutes(String minutes) throws Exception {

		java_rest_coin_api api = new java_rest_coin_api(KEY);
		Timedata[] result = api.ohlcv_get_latest_timeseries(symbolId,
				api.period_identifier_from_string(minutes + "MIN"));
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		ArrayList<Timedata> timedatas = new ArrayList<>(Arrays.asList(result));
		return timedatas.stream().collect(Collectors.averagingDouble(Timedata::get_price_close));
	}

	@Override
	public double getMedianPricesforLastMinutes(String minutes) throws Exception {
		java_rest_coin_api api = new java_rest_coin_api(KEY);
		Timedata[] result = api.ohlcv_get_latest_timeseries(symbolId,
				api.period_identifier_from_string(minutes + "MIN"));
		ArrayList<Timedata> timedatas = new ArrayList<>(Arrays.asList(result));
		DoubleStream sortedPrices = timedatas.stream().mapToDouble(Timedata::get_price_close).sorted();

		double median = timedatas.size() % 2 == 0
				? sortedPrices.skip(timedatas.size() / 2 - 1).limit(2).average().getAsDouble()
				: sortedPrices.skip(timedatas.size() / 2).findFirst().getAsDouble();
		return median;
	}
}

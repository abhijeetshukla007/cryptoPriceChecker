/**
 * 
 */
package com.checker.crypto.service;

import java.sql.Timestamp;

/**
 * @author Abhijeet
 *
 */
public interface CryptoAnalyticService {

	void getAveragePrices(Timestamp startTime, Timestamp endTime) throws Exception;

	double getAveragePrices2(Timestamp startTime, Timestamp endTime) throws Exception;

	double getAveragePricesforLastMinutes(String minutes) throws Exception;

	double getMedianPricesforLastMinutes(String minutes) throws Exception;

}

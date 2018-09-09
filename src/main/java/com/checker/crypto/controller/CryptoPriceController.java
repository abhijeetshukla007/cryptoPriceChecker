/**
 * 
 */
package com.checker.crypto.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.checker.crypto.dto.Response;
import com.checker.crypto.service.CryptoAnalyticService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author Abhijeet
 *
 */
@RestController
public class CryptoPriceController {
	@Autowired
	private CryptoAnalyticService cryptoAnalyticService;

	/*
	 * @GetMapping("/getAveragePrices") public double
	 * getAveragePrices(@ApiParam(value = "minutes", required =
	 * true) @RequestParam Timestamp startTime,
	 * 
	 * @RequestParam Timestamp endTime) { double result = 0.00; try { result =
	 * cryptoAnalyticService.getAveragePrices2(startTime, endTime); } catch
	 * (Exception e) { e.printStackTrace(); } return result; }
	 */
	@ApiOperation(value = "Get Average Prices")
	@GetMapping("/getAveragePrices/minutes")
	public ResponseEntity<Response> getAveragePricesMinutes(
			@ApiParam(value = "minutes", required = true) @RequestParam String minutes) {
		ResponseEntity<Response> responseEntity = null;
		Response response = new Response();
		double result = 0.00;
		try {
			result = cryptoAnalyticService.getAveragePricesforLastMinutes(minutes);
			response.setResult(result);
			response.setMessage("The average value of BTC for last " + minutes + " Minutes is:" + result + " INR");
			responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setMessage("Failed to get average value of BTC");
			responseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return responseEntity;
	}

	@ApiOperation(value = "Get MedianPrices")
	@GetMapping("/getMedianPrices/minutes")
	public ResponseEntity<Response> getMedianPricesMinutes(
			@ApiParam(value = "minutes", required = true) @RequestParam String minutes) {
		ResponseEntity<Response> responseEntity = null;
		Response response = new Response();
		double result = 0.00;
		try {
			result = cryptoAnalyticService.getMedianPricesforLastMinutes(minutes);
			response.setResult(result);
			response.setMessage("The median value of BTC for last " + minutes + " Minutes is:" + result + " INR");
			responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setMessage("Failed to get median value of BTC");
			responseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return responseEntity;
	}

}

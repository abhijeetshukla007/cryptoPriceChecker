package com.checker.crypto.dto;

import java.sql.Timestamp;

public class Timedata {
		private Timestamp time_period_start; // Period starting time (range left
												// inclusive)
		private Timestamp time_period_end; // Period ending time (range right
											// exclusive)
		private Timestamp time_open; // Time of first trade inside period range
		private Timestamp time_close; // Time of last trade inside period range
		private double price_open; // First trade price inside period range
		private double price_high; // Highest traded price inside period range
		private double price_low; // Lowest traded price inside period range
		private double price_close; // Last trade price inside period range
		private double volume_traded; // Cumulative base amount traded inside
										// period range
		private int trades_count; // Amount of trades executed inside period
									// range

		public Timedata(Timestamp time_period_start, Timestamp time_period_end, Timestamp time_open,
				Timestamp time_close, double price_open, double price_high, double price_low, double price_close,
				double volume_traded, int trades_count) {
			this.time_period_start = time_period_start;
			this.time_period_end = time_period_end;
			this.time_open = time_open;
			this.time_close = time_close;
			this.price_open = price_open;
			this.price_high = price_high;
			this.price_low = price_low;
			this.price_close = price_close;
			this.volume_traded = volume_traded;
			this.trades_count = trades_count;
		}

		public Timestamp get_time_period_start() {
			return time_period_start;
		}

		public Timestamp get_time_period_end() {
			return time_period_end;
		}

		public Timestamp get_time_open() {
			return time_open;
		}

		public Timestamp get_time_close() {
			return time_close;
		}

		public double get_price_open() {
			return price_open;
		}

		public double get_price_high() {
			return price_high;
		}

		public double get_price_low() {
			return price_low;
		}

		public double get_price_close() {
			return price_close;
		}

		public double get_volume_traded() {
			return volume_traded;
		}

		public int get_trades_count() {
			return trades_count;
		}

		@Override
		public String toString() {
			return "timedata [time_period_start=" + time_period_start + ", time_period_end=" + time_period_end
					+ ", time_open=" + time_open + ", time_close=" + time_close + ", price_open=" + price_open
					+ ", price_high=" + price_high + ", price_low=" + price_low + ", price_close=" + price_close
					+ ", volume_traded=" + volume_traded + ", trades_count=" + trades_count + "]";
		}

	}

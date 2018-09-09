package com.checker.crypto.coinapi;

public enum SYMBOL_TYPE {

	INVALID, // Reserverd value for invalid data
	SPOT, // FX Spot. Agreement to exchange one asset for another one (e.g.
			// Buy BTC for USD)
	FUTURES, // Futures contract. FX Spot derivative contract where traders
				// agree to trade fx spot at predetermined future time
	OPTION // Option contract. FX Spot derivative contract where traders
			// agree to trade right to require buy or sell of fx spot at
			// agreed price on exercise date

}

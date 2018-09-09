package com.checker.crypto.coinapi;

public class asset {

	private String asset_id; // Our asset identifier. Superset of the ISO
								// 4217 currency codes standard
	private String name; // Display name of the asset
	private boolean type_is_crypto; // true for cryptocurrency assets, false
									// otherwise

	public asset(String asset_id, String name, boolean type_is_crypto) {
		this.asset_id = asset_id;
		this.name = name;
		this.type_is_crypto = type_is_crypto;
	}

	public String get_asset_id() {
		return asset_id;
	}

	public String get_name() {
		return name;
	}

	public boolean is_type_crypto() {
		return type_is_crypto;
	}

}

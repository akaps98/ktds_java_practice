package com.ktuniversity.edu.stream.file.csv;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private int id;
	private String name;
	private String iso3;
	private String iso2;
	private String numericCode;
	private String phonecode;
	private String capital;
	private String currency;
	private String currencyName;
	private String currencySymbol;
	private String tld;
	private String translateNative; // native
	private String region;
	private int regionId;
	private String subRegion;
	private int subRegionId;
	private String nationality;
	private String timezones;
	private double latitude;
	private double longitude;
	private String emoji;
	private String emojiU;
	
	private SubRegion subRegionInfo;
	private List<State> stateList;
	
	public Country(String[] countryData) {
		this(
			Integer.parseInt(countryData[0]), // id
			countryData[1], // name
			countryData[2], // iso3
			countryData[3], // iso2
			countryData[4], // numericCode
			countryData[5], // phonecode
			countryData[6], // capital
			countryData[7], // currency
			countryData[8], // currencyName
			countryData[9], // currencySymbol
			countryData[10], // tld
			countryData[11], // translateNative (native)
			countryData[12], // region
			Integer.parseInt(countryData[13]), // regionId
			countryData[14], // subRegion
			Integer.parseInt(countryData[15]), // subRegionId
			countryData[16], // nationality
			countryData[17], // timezones
			Double.parseDouble(countryData[18]), // latitude
			Double.parseDouble(countryData[19]), // longitude
			countryData[20], // emoji
			countryData[21] // emojiU
		);
	}

	public Country(int id, String name, String iso3, String iso2, 
			String numericCode, String phonecode, String capital,
			String currency, String currencyName, String currencySymbol, 
			String tld, String translateNative,
			String region, int regionId, String subRegion, 
			int subRegionId, String nationality, String timezones,
			double latitude, double longitude, String emoji, String emojiU) {
		this.id = id;
		this.name = name;
		this.iso3 = iso3;
		this.iso2 = iso2;
		this.numericCode = numericCode;
		this.phonecode = phonecode;
		this.capital = capital;
		this.currency = currency;
		this.currencyName = currencyName;
		this.currencySymbol = currencySymbol;
		this.tld = tld;
		this.translateNative = translateNative;
		this.region = region;
		this.regionId = regionId;
		this.subRegion = subRegion;
		this.subRegionId = subRegionId;
		this.nationality = nationality;
		this.timezones = timezones;
		this.latitude = latitude;
		this.longitude = longitude;
		this.emoji = emoji;
		this.emojiU = emojiU;
		this.stateList = new ArrayList<>();
	}
	
	public List<State> getStateList() {
		return stateList;
	}
	
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	
	public SubRegion getSubRegionInfo() {
		return subRegionInfo;
	}
	
	public void setSubRegionInfo(SubRegion subRegionInfo) {
		this.subRegionInfo = subRegionInfo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getIso3() {
		return iso3;
	}

	public String getIso2() {
		return iso2;
	}

	public String getNumericCode() {
		return numericCode;
	}

	public String getPhonecode() {
		return phonecode;
	}

	public String getCapital() {
		return capital;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public String getTld() {
		return tld;
	}

	public String getTranslateNative() {
		return translateNative;
	}

	public String getRegion() {
		return region;
	}

	public int getRegionId() {
		return regionId;
	}

	public String getSubRegion() {
		return subRegion;
	}

	public int getSubRegionId() {
		return subRegionId;
	}

	public String getNationality() {
		return nationality;
	}

	public String getTimezones() {
		return timezones;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getEmoji() {
		return emoji;
	}

	public String getEmojiU() {
		return emojiU;
	}
	
	
}









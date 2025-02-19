package com.ktuniversity.edu.stream.file.csv;

public class State {
	private int id;
	private String name;
	private int countryId;
	private String countryCode;
	private String countryName;
	private String stateCode;
	private String type;
	private double latitude;
	private double longitude;
	
	public State(int id, String name, int countryId, String countryCode, String countryName, String stateCode,
			String type, double latitude, double longitude) {
		this.id = id;
		this.name = name;
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.stateCode = stateCode;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public State(String[] countryData) {
		this(Integer.parseInt(countryData[0]),
			 countryData[1],
			 Integer.parseInt(countryData[2]),
			 countryData[3],
			 countryData[4],
			 countryData[5],
			 countryData[6],
			 Double.parseDouble(countryData[7]),
			 Double.parseDouble(countryData[8]));
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCountryId() {
		return countryId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public String getType() {
		return type;
	}

	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
}

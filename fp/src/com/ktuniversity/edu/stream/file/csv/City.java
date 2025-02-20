package com.ktuniversity.edu.stream.file.csv;

public class City {
	
	private int id;
	private String name;
	private int stateId;
	private String stateCode;
	private String stateName;
	private int countryId;
	private String countryCode;
	private String countryName;
	private double latitude;
	private double longitude;
	private String wikiDataId;

	private State state;
	
	public City(String[] cityData) {
		this(
			Integer.parseInt(cityData[0]), //id
			cityData[1], // name
			Integer.parseInt(cityData[2]), //stateId 
			cityData[3], // stateCode
			cityData[4], // stateName
			Integer.parseInt(cityData[5]), //countryId
			cityData[6], // countryCode
			cityData[7], // countryName
			Double.parseDouble(cityData[8]),
			Double.parseDouble(cityData[9]),
			cityData.length > 10 ? cityData[10] : null // wikiDataId
		);
	}

	public City(int id, String name, int stateId, String stateCode, String stateName, 
			int countryId, String countryCode,
			String countryName, double latitude, double longitude, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.stateId = stateId;
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.wikiDataId = wikiDataId;
	}

	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStateId() {
		return stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public String getStateName() {
		return stateName;
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

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getWikiDataId() {
		return wikiDataId;
	}

}
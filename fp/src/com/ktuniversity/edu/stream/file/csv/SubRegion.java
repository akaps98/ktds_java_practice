package com.ktuniversity.edu.stream.file.csv;

import java.util.ArrayList;
import java.util.List;

public class SubRegion {

	private int id;
	private String name;
	private int regionId;
	private String wikiDataId;
	
	private Region region;
	private List<Country> countries;

	public SubRegion(String[] subRegionData) {
		this(
			Integer.parseInt(subRegionData[0]),
			subRegionData[1],
			Integer.parseInt(subRegionData[2]),
			subRegionData[3]
		);
	}

	public SubRegion(int id, String name, int regionId, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.regionId = regionId;
		this.wikiDataId = wikiDataId;
		this.countries = new ArrayList<>();

	}
	
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
	public List<Country> getCountries() {
		return countries;
	}
	
	public void setRegion(Region region) {
		this.region = region;
	}
	
	public Region getRegion() {
		return region;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRegionId() {
		return regionId;
	}

	public String getWikiDataId() {
		return wikiDataId;
	}

}
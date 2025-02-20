package com.ktuniversity.edu.stream.file.csv;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private int id;
	private String name;
	private String wikiDataId;
	
	private List<SubRegion> subRegions;

	public Region(String[] regionData) {
		this(
			Integer.parseInt(regionData[0]),
			regionData[1],
			regionData[2]
		);
	}
	
	public Region(int id, String name, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.wikiDataId = wikiDataId;
		this.subRegions = new ArrayList<>();
	}
	
	public void setSubRegions(List<SubRegion> subRegions) {
		this.subRegions = subRegions;
	}
	
	public List<SubRegion> getSubRegions() {
		return subRegions;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getWikiDataId() {
		return wikiDataId;
	}

}
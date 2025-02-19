package com.ktuniversity.edu.stream.file.csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;

public class ReadCSV {
	private final String CSV_PATH = "/Users/tony/Desktop/streamexam";
	
	public static void main(String[] args) {
		ReadCSV csv = new ReadCSV();
		List<City> cities = csv.loadDate(FileName.CITIES, null);
		List<Country> countries = csv.loadDate(FileName.COUNTRIES);
		List<Region> regions = csv.loadDate(FileName.REGIONS);
		List<State> states = csv.loadDate(FileName.STATES, (array) -> new State(array));
		List<SubRegion> subRegions = csv.loadDate(FileName.SUB_REGIONS);
	}
	
	public <R> List<R> loadDate(FileName filename, Function<String[], R> function) {
		try {
			return Files.lines(new File(this.CSV_PATH, filename.filename).toPath())
					    .skip(1)
					    .map(line -> line.split(","))
					    .map(arr -> function.apply(arr))
					    .toList();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

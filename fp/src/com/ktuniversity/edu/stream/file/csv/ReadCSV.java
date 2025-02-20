package com.ktuniversity.edu.stream.file.csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReadCSV {

	private final String CSV_PATH = "/Users/tony/Desktop/streamexam";
	
	/**
	 * 파일을 알아서 읽어 리스트로 변환한다.
	 * @param <R> 리스트의 제네릭. (로컬 제네릭: 메소드 내부에서만 사용할 수 있는 제네릭.) 
	 * @param filename
	 * @param function 
	 * @return
	 */
	public <R> List<R> loadData(FileName filename, Function<String[], R> function, Predicate<R> condition) {
		try {
			return Files.lines( new File(this.CSV_PATH, filename.filename).toPath() ) // Stream<String>
						.skip(1) // Stream<String>
						.map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
						.map(array -> function.apply(array)) // Stream<R>
						.filter(inst -> condition != null ? condition.test(inst) : true) // Stream<R>
						.toList() // List<R>
				 ;
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		return null;
	}
	
	public void printAllRegions() {
		System.out.println("======= print all regions =======");
		this.loadData(FileName.REGIONS, array -> new Region(array), null)
			.forEach(region -> {
				System.out.println("=".repeat(50));
				System.out.println("Region ID: " + region.getId());
				System.out.println("Region Name: " + region.getName());
			});
	}
	
	public void printAllSubRegions() {
		System.out.println("======= print all sub regions =======");
		this.loadData(FileName.SUB_REGIONS, SubRegion::new, null)
			.forEach(subRegion -> {
				System.out.println("=".repeat(50));
				System.out.println("Sub Region ID: " + subRegion.getId());
				System.out.println("Sub Region Name: " + subRegion.getName());
				System.out.println("Sub Region's Region ID: " + subRegion.getRegionId());
			});
	}

	public void printAllCountries() {
		System.out.println("======= print all countries =======");
		this.loadData(FileName.COUNTRIES, Country::new, null)
			.forEach(country -> {
				System.out.println("=".repeat(50));
				System.out.println("Country ID: " + country.getId());
				System.out.println("Country Name: " + country.getName());
				System.out.println("Country's Region Name: " + country.getRegion());
				System.out.println("Country's Sub Region Name: " + country.getSubRegion());
			});
	}
	
	public void printAllStates() {
		System.out.println("======= print all states =======");
		this.loadData(FileName.STATES, State::new, null)
			.forEach(state -> {
				System.out.println("=".repeat(50));
				System.out.println("State ID: " + state.getId());
				System.out.println("State Name: " + state.getName());
				System.out.println("State Code: " + state.getStateCode());
				System.out.println("State's Country Name: " + state.getCountryName());
			});
	}
	
	public void printAllCities() {
		System.out.println("======= print all cities =======");
		this.loadData(FileName.CITIES, City::new, null)
			.forEach(city -> {
				System.out.println("=".repeat(50));
				System.out.println("City ID: " + city.getId());
				System.out.println("City Name: " + city.getName());
				System.out.println("City's State Name: " + city.getStateName());
				System.out.println("City's Country Name: " + city.getCountryName());
			});
	}
	
	public void printAllCitiesOfSouthKorea() {
		System.out.println("======= print all cities of south korea =======");
		this.loadData(FileName.CITIES, City::new, city -> city.getCountryName().equals("\"South Korea\""))
			.forEach(city -> {
				System.out.println("=".repeat(50));
				System.out.println("City ID: " + city.getId());
				System.out.println("City Name: " + city.getName());
				System.out.println("City's State Name: " + city.getStateName());
				System.out.println("City's Country Name: " + city.getCountryName());
			});
	}
	
	public void printAllCitiesOfState(int stateId) {
		System.out.println("======= print all cities of state =======");
		// State 정보를 stateId로 찾는다
		this.loadData(FileName.STATES, State::new, state -> state.getId() == stateId)
			.stream()
			.flatMap(state -> this.loadData(FileName.CITIES, City::new, city -> city.getStateId() == state.getId()).stream())
			.forEach(city -> System.out.println(city.getName()));
			// 해당 state가 조회됨
			// 찾은 state id로 소속된 모든 도시를 가져온다
		// 찾은 모든 도시들을 출력한다
	}
	
	public void printAllCitiesOfCountry(int countryId) {
		System.out.println("======= print all cities of country =======");
		this.loadData(FileName.COUNTRIES, Country::new, country -> country.getId() == countryId)
			.stream()
			.flatMap(country -> this.loadData(FileName.STATES, State::new, state -> state.getCountryId() == country.getId()).stream())
			.flatMap(state -> this.loadData(FileName.CITIES, City::new, city -> city.getStateId() == state.getId()).stream())
			.forEach(city -> System.out.println(city.getName() + " / " + city.getStateName() + " / " + city.getCountryName()));
	}
	
	public void printAllCitiesOfSubRegion(int subRegionId) {
		System.out.println("======= print all cities of sub region =======");
		this.loadData(FileName.SUB_REGIONS, SubRegion::new, subRegion -> subRegion.getId() == subRegionId)
			.stream()
			.flatMap(subRegion -> this.loadData(FileName.COUNTRIES, Country::new, country -> country.getSubRegionId() == subRegion.getId()).stream())
			.flatMap(country -> this.loadData(FileName.STATES, State::new, state -> state.getCountryId() == country.getId()).stream())
			.flatMap(state -> this.loadData(FileName.CITIES, City::new, city -> city.getStateId() == state.getId()).stream())
			.forEach(city -> System.out.println(city.getName() + " / " + city.getStateName() + " / " + city.getCountryName()));;
	}
	
	public void printAllCitiesOfRegion(int regionId) {
		System.out.println("======= print all cities of region =======");
		this.loadData(FileName.REGIONS, Region::new, Region -> Region.getId() == regionId)
			.stream()
			.flatMap(region -> this.loadData(FileName.SUB_REGIONS, SubRegion::new, subRegion -> subRegion.getRegionId() == region.getId()).stream())
			.flatMap(subRegion -> this.loadData(FileName.COUNTRIES, Country::new, country -> country.getSubRegionId() == subRegion.getId()).stream())
			.flatMap(country -> this.loadData(FileName.STATES, State::new, state -> state.getCountryId() == country.getId()).stream())
			.flatMap(state -> this.loadData(FileName.CITIES, City::new, city -> city.getStateId() == state.getId()).stream())
			.forEach(city -> System.out.println(city.getName() + " / " + city.getStateName() + " / " + city.getCountryName()));
	}
	
	public City getOneCityWithState(String cityName) {
		return this.loadData(FileName.CITIES, City::new, city -> city.getName().equals(cityName))
			.stream()
			.map(city -> {
				city.setState(this.loadData(FileName.STATES, State::new, state -> state.getId() == city.getStateId())
				//					  .get(0);
									  .stream()
									  .findFirst()
									  .orElse(null));
				return city;
			})
			.findFirst()
			.orElse(null);
	}
	
	public Country getOneCountry(String countryName) {
		List<State> states = this.loadData(FileName.STATES, State::new, null);
		List<City> cities = this.loadData(FileName.CITIES, City::new, null);
		
		return this.loadData(FileName.COUNTRIES, Country::new, country -> country.getName().equals(countryName))
				   .stream()
				   .map(country -> {
					   List<State> countryState = states.stream()
												   	    .filter(state -> state.getCountryId() == country.getId())
												   	    .map(state -> {
												   	    	List<City> stateCity = cities.stream()
												   	    		  .filter(city -> city.getStateId() == state.getId())
												   	    		  .toList();
												   	    	state.setCities(stateCity);
												   	    	
												   	    	return state;
												   	    })
												   		.toList();
					   country.setStateList(countryState);
					   return country;
				   })
				   .findFirst()
				   .orElse(null);
	}
	
	public SubRegion getOneSubRegion(String subRegionName) {
		return null;
	}
	
	public static void main(String[] args) {
		ReadCSV csv = new ReadCSV();
//		csv.printAllRegions();
//		csv.printAllSubRegions();
//		csv.printAllCountries();
//		csv.printAllStates();
//		csv.printAllCities();
//		csv.printAllCitiesOfSouthKorea();
		
//		csv.printAllCitiesOfState(3849);
//		csv.printAllCitiesOfCountry(116);
//		csv.printAllCitiesOfSubRegion(12);
//		csv.printAllCitiesOfRegion(3);
//		
//		City city = csv.getOneCityWithState("Paris");
//		System.out.println(city.getName());
//		System.out.println(city.getStateId());
//		System.out.println(city.getState().getName());
//		System.out.println(city.getState().getType());
		
		Country country = csv.getOneCountry("\"South Korea\"");
		System.out.println(country.getName());
		country.getStateList()
			   .forEach(state -> {
				   System.out.println(state.getName());
				   
				   state.getCities()
				   		.forEach(city -> {
				   			System.out.println(city.getName());
				   		});
			   });
//		SubRegion subRegion = csv.getOneSubRegion("\"Eastern Asia\"");
	}
	
}





package movie;

public class Downtown {
	public static void addNumber(int num) {
		num += 10;
		System.out.println(num);
	}
	
	public static void appendName(String lastName) {
		lastName += "Junsik";
		System.out.println(lastName);
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		addNumber(num);
		System.out.println(num);
		
		String name = "Kang";
		System.out.println(name);
		appendName(name);
		System.out.println(name);
		
		Theater cgv = new Theater();
		
		Movie harbin = new Movie();
		harbin.title = "harbin";
		harbin.runningTime = 3600;

		Seat h6 = new Seat();
		h6.seatNumber = "h6";
		h6.isFold = true;
		
		Speaker harman = new Speaker();
		harman.volume = 50;
		harman.isOn = false;
		
		Light sony = new Light();
		sony.color = "dark yellow";
		sony.isOn = true;
		
		AirConditioner carrier = new AirConditioner();
		carrier.isOn = false;
		carrier.windSpeed = 5;
		carrier.curTemp = 36.5f;
		carrier.aimedTemp = 26.5f;
		
		Projector miniBeam = new Projector();
		miniBeam.isOn = true;
		
		cgv.movie = harbin;
		cgv.seat = h6;
		cgv.speaker = harman;
		cgv.light = sony;
		cgv.airConditioner = carrier;
		cgv.projector = miniBeam;
		
		cgv.playMovie();
		cgv.playMovie();
		
		cgv.turnOnAirConditioner();
		cgv.turnOnAirConditioner();
		
		cgv.turnOnLight();
		cgv.turnOnLight();
		
		cgv.controlVolume(50);
		cgv.controlVolume(60);
		cgv.controlVolume(-70);
		cgv.controlVolume(-60);
		
		cgv.controlSeat();
		cgv.controlSeat();
	}
}

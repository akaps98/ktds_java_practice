package first_java_program;

public class Car {
	public String name;
	public String company;
	private int serialNumber;
	
	public Car(String name, String company) {
		this.name = name;
		this.company = company;
		this.serialNumber = 0;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
}

package first_java_program;

public class Benz extends Car {
	public int price;
	public String date;
	
	public Benz(String name, String company, int price, String date) {
		super(name, company);
		this.price = price;
		this.date = date;
	}
	
	public void printInfo() {
		System.out.println(super.name + super.company + String.valueOf(price) + String.valueOf(super.getSerialNumber() + date));
	}

	@Override
	public int getSerialNumber() {
		// TODO Auto-generated method stub
		return super.getSerialNumber();
	}

	@Override
	public void setSerialNumber(int serialNumber) {
		// TODO Auto-generated method stub
		super.setSerialNumber(serialNumber);
	}
}

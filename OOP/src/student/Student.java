package student;

public class Student {
	public int java;
	public int python;
	public int cpp;
	public int csharp;
	
	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	public double getAverage() {
		return ((int) (getSumAllScores() / 4 * 100.0)) / 100.0;
	}
	
	public double getCourseCredit() {
		return ((int) (((getAverage() - 55) / 10) * 100.0)) / 100.0;
	}
	
	public String getABCDF() {
		double credit = getCourseCredit();
		
		if(credit >= 4.1) {
			return "A+";
		} else if(credit >= 3.6) {
			return "A";
		} else if(credit >= 3.1) {
			return "B+";
		} else if(credit >= 2.6) {
			return "B";
		} else if(credit >= 1.6) {
			return "C";
		} else if(credit >= 0.6) {
			return "D";
		} else {
			return "F";
		}
	}
}

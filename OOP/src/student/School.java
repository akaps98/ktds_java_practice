package student;

public class School {
	public static void main(String[] args) {
		Student std = new Student();
		std.cpp = 81;
		std.csharp = 99;
		std.java = 100;
		std.python = 97;
		
		System.out.println("Total score is " + std.getSumAllScores());
		System.out.println("The average is " + std.getAverage());
		System.out.println("The course credit is " + std.getCourseCredit());
		System.out.println("Your grade is " + std.getABCDF());
	}
}

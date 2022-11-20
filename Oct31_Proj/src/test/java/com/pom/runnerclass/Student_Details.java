package com.pom.runnerclass;

import com.utility.variables.Utility_Variables;

public class Student_Details {
	
	public static Utility_Variables details = new Utility_Variables();

	public static void main(String[] args) {

		

		details.setName("Hari Baskar");
		System.out.println("My Name :"+details.getName());

		details.setAge(23);

		System.out.println("My age :"+details.getAge());

		details.setEducation("BE");
		System.out.println("My Qualification :"+details.getEducation());

		details.setPercent(7.80);

		System.out.println("My Cgpa :"+details.getPercent());

	}

}

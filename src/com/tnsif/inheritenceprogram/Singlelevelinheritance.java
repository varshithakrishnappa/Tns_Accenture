package com.tnsif.inheritenceprogram;

//parent class
class Course{
	String coursename="java program";

void showCourse() {
	System.out.println("course :"+coursename);
}
}
//child class

class Student extends Course{
	String studentname="rohan";
	
	void Showstudent() {
		System.out.println("student :"+studentname);
	}
}

public class Singlelevelinheritance {
public static void main(String[] args) {
	Student s=new Student();
//	Course c=new Course();
	s.showCourse();
	s.Showstudent();
}
}
package com.tnsif.statickeyword;
//demo for static variable

class College{
	int StudentId;
	String name;
	
	static String collegename="SIET";
	
	College(int StudentId,String name){
		this.StudentId=StudentId;
		this.name=name;
	}
	
	void display() {
		System.out.println("StudentId :"+StudentId +" name :"+name+"collegename :"+collegename);
	}
}
public class Staticvariable {
	public static void main(String[] args) {
	College c1=new College(1,"rashmi");
	College c2=new College(2,"rohan");
	College c3=new College(3,"dharshan");
	 c1.display();
	 c2.display();
	 c3.display();
	}
}

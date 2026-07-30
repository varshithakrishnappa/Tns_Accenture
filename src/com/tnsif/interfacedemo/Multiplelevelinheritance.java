package com.tnsif.interfacedemo;
// demo for multiple level of inheritance
interface  Camera{
	void takephoto();
}
 interface Musicplayer{
	 void playmusic();
 }
 class SmartPhone implements Camera,Musicplayer{

	@Override
	public void playmusic() {
		System.out.println("playing music on the smartphone");
	}

	@Override
	public void takephoto() {
		System.out.println("taking photo");
	}
	 
 }

public class Multiplelevelinheritance {
public static void main(String[] args) {
	 SmartPhone s=new  SmartPhone();
	 s.playmusic();
	 s.takephoto();
}
}
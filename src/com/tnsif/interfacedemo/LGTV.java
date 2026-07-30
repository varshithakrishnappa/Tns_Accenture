package com.tnsif.interfacedemo;
class tv implements Remote{

	@Override
	public void powerOn() {
		System.out.println("lgtv is switching on");
		// TODO Auto-generatemethod stub
		
	}

	@Override
	public void powerOff() {
		System.out.println("lgtv is switching off");
		// TODO Auto-generated method stub
		
	}

}
public class LGTV {
	public static void main(String[] args) {
		Remote r=new tv();
		r.powerOn();
		r.powerOff();
	}
}

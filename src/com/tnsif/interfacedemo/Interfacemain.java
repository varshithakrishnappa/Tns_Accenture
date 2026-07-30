package com.tnsif.interfacedemo;
class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("smart light on");
		
	}

	@Override
	public void turnOFF() {
		System.out.println("smart light off");
	}

	@Override
	public void getStatus() {
		System.out.println("smart light is standy mood");
	}
	
}

public interface Interfacemain {
	public static void main(String[] args) {
		SmartDevice d=new SmartLight();
		d.turnOFF();
		d.turnOn();
		d.getStatus();
	}

}

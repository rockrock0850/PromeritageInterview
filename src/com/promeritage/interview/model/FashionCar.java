package com.promeritage.interview.model;

import com.promeritage.interview.base.BaseCar;

public class FashionCar extends BaseCar{
	private boolean sunroof;
	
	private String doors;
	
	private String brand;

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}

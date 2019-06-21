package com.spiders.ci;

import java.util.Map;

public class Galaxy {

	private Map<Double, String> starsNameAndLocation;
	private String name;

	public Galaxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Galaxy(Map<Double, String> starsNameAndLocation, String name) {
		super();
		this.starsNameAndLocation = starsNameAndLocation;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Galaxy [starsNameAndLocation=" + starsNameAndLocation + ", name=" + name + "]";
	}

	public Map<Double, String> getStarsNameAndLocation() {
		return starsNameAndLocation;
	}

	public void setStarsNameAndLocation(Map<Double, String> starsNameAndLocation) {
		this.starsNameAndLocation = starsNameAndLocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

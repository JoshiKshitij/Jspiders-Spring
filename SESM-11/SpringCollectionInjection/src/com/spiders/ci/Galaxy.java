package com.spiders.ci;

import java.util.Collection;

public class Galaxy {
	
	private Collection<String> starsName;
	private String name;
	

	public Galaxy(Collection<String> starsName, String name) {
		super();
		this.starsName = starsName;
		this.name = name;
	}

	public Galaxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<String> getStarsName() {
		return starsName;
	}

	public void setStarsName(Collection<String> starsName) {
		this.starsName = starsName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Universe [starsName=" + starsName + ", name=" + name + "]";
	}
	
	
	
	

	
}

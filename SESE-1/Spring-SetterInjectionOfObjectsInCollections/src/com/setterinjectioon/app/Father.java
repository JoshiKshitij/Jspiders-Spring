package com.setterinjectioon.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Father {

	private String name;
	private List<Son> sons;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Son> getSons() {
		return sons;
	}

	public void setSons(List<Son> sons) {
		this.sons = sons;
	}

	@Override
	public String toString() {
		return "Father [name=" + name + ", sons=" + sons + "]";
	}

}

package com.setterinjectioon.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Father {

	private String name;	
	Map<String , Son> sons = new HashMap();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Father [name=" + name + ", sons=" + sons + "]";
	}

	public Map<String, Son> getSons() {
		return sons;
	}

	public void setSons(Map<String, Son> sons) {
		this.sons = sons;
	}

}

package com.setterinjectioon.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int rollNo;
	private String name;
	private List<String> favBooks;
	private Set<Integer> favNo;
	private Map<Integer, String> bestFriends;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		System.out.println("roll no setter is called");
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name setter is called");
		this.name = name;
	}

	public List<String> getFavBooks() {
		return favBooks;
	}

	public void setFavBooks(List<String> favBooks) {
		this.favBooks = favBooks;
	}

	public Set<Integer> getFavNo() {
		return favNo;
	}

	public void setFavNo(Set<Integer> favNo) {
		this.favNo = favNo;
	}

	public Map<Integer, String> getBestFriends() {
		return bestFriends;
	}

	public void setBestFriends(Map<Integer, String> bestFriends) {
		this.bestFriends = bestFriends;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", favBooks=" + favBooks + ", favNo=" + favNo
				+ ", bestFriends=" + bestFriends + "]";
	}

}

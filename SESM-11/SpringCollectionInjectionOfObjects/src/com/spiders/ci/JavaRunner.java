package com.spiders.ci;

import java.util.ArrayList;
import java.util.List;

public class JavaRunner {

	public static void main(String[] args) {
		Student aman = new Student();
		aman.setName("name");
		aman.setRollNo("12");
		aman.setStream("ece");

		Address amanOffice = new Address("12355" , "ka" , "bangalore" , "10 mains");
		Address amanHome = new Address("7654" , "punjab" ,"ludhiana" ,"street 5");
		
		List<Address> listOfAddressOfAman = new ArrayList<Address>();
		listOfAddressOfAman.add(amanHome);
		listOfAddressOfAman.add(amanOffice);
	//	aman.setListOfAddress(listOfAddressOfAman);
		
		
		System.out.println(aman);
		
		
		
		
		
		
	}

}

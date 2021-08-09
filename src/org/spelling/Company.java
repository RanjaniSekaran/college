package org.spelling;

import java.util.Scanner;

import org.cilent.Client;

public class Company extends Client {
public void companyName() {
	Scanner s = new Scanner(System.in);
	System.out.println(" Enter COmpany name");
	String name; name=s.nextLine();
System.out.println("Company Name is "+name);	
}
public static void main(String[] args) {
	Company c = new Company();
	c.companyName();
	c.cilentName();
}
}

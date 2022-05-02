package com.simplilearn.test.program;
import java.util.*;
public class Test_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Mixed ArrayList");
		ArrayList al = new ArrayList();
		al.add("Pratik");
		al.add(24);
		al.add('A');
		al.add(17.00f);
		System.out.println(al);
		
		System.out.println("clone "+al.clone());
		
		
		System.out.println("Only Single type of data ArrayList");
		//ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> name = new ArrayList();
		name.add("Pratik");
		name.add("Munna");
		name.add("Ujjwal");
		name.add("Aditya");
		
		System.out.println(name);
		
	}

}

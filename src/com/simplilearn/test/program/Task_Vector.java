package com.simplilearn.test.program;
import java.util.*;
public class Task_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = {10,30,40};
		
		System.out.println("Vector");
		Vector vc = new Vector();
		vc.addElement(10);   // addelement
		vc.addElement(20);
		
		vc.add(10); // add same
		
		System.out.println(vc.addAll(vc));   // 
		
		System.out.println(vc.size());
		
		System.out.println(vc);
		
		System.out.println(vc.isEmpty());
		
		
	}

}

package com.simplilearn.test.program;
import java.util.*;
public class Test_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet<Integer> lhs = new LinkedHashSet();
		lhs.add(123);
		lhs.add(523);
		lhs.add(173);
		lhs.add(230);
		
		System.out.println(lhs);
		
		System.out.println();
		System.out.println("Fore Each loop");
		for (int  a:lhs) {
			System.out.println(a);
		}
		
		
	}

}

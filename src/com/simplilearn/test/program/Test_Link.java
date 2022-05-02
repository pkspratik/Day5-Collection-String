package com.simplilearn.test.program;
import java.util.*;
public class Test_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("Pratik ");
		ls.add("munna ");
		ls.add("Ujjwal ");
		
		System.out.println(ls);
		
		Iterator itr =ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String a:ls) {
			System.out.println(a);
		}
	}

}

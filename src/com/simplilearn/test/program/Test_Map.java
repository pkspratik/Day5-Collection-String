package com.simplilearn.test.program;
import java.util.*;
public class Test_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer ,String > hm = new HashMap();
		
		hm.put(1,"Pratik");
		hm.put(2,"munna");
		hm.put(3, "Ujjwal");
		
		System.out.println(hm);
		
		  for(Map.Entry m:hm.entrySet()){    
	            System.out.println(m.getKey()+" "+m.getValue());    
	        }
		  
		  
		  
		  //HashTable
	        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	        ht.put(4,"Ales");  
	        ht.put(5,"Rosy");  
	        ht.put(6,"Jack");  
	        ht.put(7,"John");  
	        System.out.println("\nThe elements of HashTable are ");  
	        for(Map.Entry n:ht.entrySet()){    
	            System.out.println(n.getKey()+" "+n.getValue());    
	        }
	        //TreeMap
	        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	        map.put(9,"Carlotte"); 
	        map.put(10,"Catie"); 
	        map.put(8,"Annie"); 
	        
	        
	        System.out.println("\nThe elements of TreeMap are ");  
	        for(Map.Entry l:map.entrySet()){    
	            System.out.println(l.getKey()+" "+l.getValue());    
	        }    
		
	}

}








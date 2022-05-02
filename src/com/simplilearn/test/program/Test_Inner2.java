package com.simplilearn.test.program;

public class Test_Inner2 {

	  private String msg="Inner Classes";//8
	    void display(){  //3
	        class Inner{  
	            void msg(){//6
	                System.out.println(msg);//7
	            }  
	        }  
	        Inner l=new Inner(); //4 
	        l.msg(); //5 
	    }  
	    public static void main(String[] args) {
	    	Test_Inner2  ob=new Test_Inner2 ();  //1
	        ob.display();  //2
	    }

}




package com.simplilearn.test.program;

public class Test_Innerclass1 {

 private String msg="Welcome to Java"; 
     
     class Inner{  
      void hello(){
          System.out.println(msg+", Let us start learning Inner Classes");
      }  
     }  
    public static void main(String[] args) {
    	Test_Innerclass1 obj=new Test_Innerclass1();
    	Test_Innerclass1.Inner in=obj.new Inner();  
        in.hello();  
    }

}




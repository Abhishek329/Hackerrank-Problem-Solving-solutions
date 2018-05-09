package com.programs;

import java.util.Scanner;

public class GCDofnumbers {

	public static void main(String[] args) {
		 Scanner in1 = new Scanner(System.in);
	        int num1= in1.nextInt(); 
	        Scanner in2=new Scanner(System.in);// Writing output to STDOUT
	        int num2= in2.nextInt(); 
	        System.out.println("To find the common factors of" + num1+ "and "+num2);
	        int result=Commonfactors(num1,num2);
	       
	        System.out.println(result);
	       
	        

	}

	private static int Commonfactors(int num1, int num2) {
		int count=0;
		
		int r=0;
	       if(num2>num1)
	       {
	           while(num1!=0)
	           {
	        	r=num2%num1;
	        	num2=num1;
	        	num1=r;
	        	count++;
	           }
	              
	           
	       }
	       else if(num1>num2)
	       {
	          while(num2!=0)
	          {
	        	  r=num1%num2;
	        	  num1=num2;
	        	  num2=r;
	        	  count++;
	          }
	              
	          
	       }
		return count;
	    
	   
		
		
		
		
	}

}

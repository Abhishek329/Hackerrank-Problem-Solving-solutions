package com.programs;

import java.util.HashMap;
import java.util.Scanner;

public class Timeformat {

	 static String timeConversion(String s) 
	 {
		 char[] check=s.toCharArray();
		 HashMap<Integer,Integer> map= new HashMap<>();
		
			 if(check[check.length-2]=='P')
			 {
				 //System.out.println("Time needs conversion");
			 
			 map.put(01, 13);
			 map.put(02,14);
			 map.put(03,15);
			 map.put(04, 16);
			 map.put(05, 17);
			 map.put(06, 18);
			 map.put(07, 19);
			 map.put(8, 20);
			 map.put(9, 21);
			 map.put(10, 22);
			 map.put(11, 23);
			// map.put(12, 00);

			        // Complete this function
			    
			 }
			 else if(check[check.length-2]=='A' && check[0]=='1' && check[1]=='2')
			 {
				 map.put(12, 00);
				 
			 }
			 else if(check[check.length-2]=='P' && check[0]=='1' && check[1]=='2')
			 {
				 String s1= s.substring(0,8);
				 //System.out.println(s1);
				 return s1;
			 }
			 else
			 {
				String s1= s.substring(0,8);
				 //System.out.println(s1);
				 return s1;
			 }
		 
		 
		  String[] output= s.split(":");
		   int hr= Integer.parseInt(output[0]);
		   int con = 0;
		   int fcon=0;
		   String hour;
		   //String hour=null;
		   if(map.containsKey(hr))
		   {
			   con=map.get(hr);
		   }
		   
		   if(con==0)
		   {
			hour=String.format("%02d", con);
			   //System.out.println(hour);
		   }
		   else
		   {
			   hour=Integer.toString(con);
		   }
		   
		   String mm=output[1];
		   String secs=output[2].substring(0, 2);
		   //System.out.println(secs);
		   
		   String res= hour+":"+mm+":"+secs;
		   	    
			 return res;
		
	 }		  


	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = timeConversion(s);
	        System.out.println(result);
	    }

}

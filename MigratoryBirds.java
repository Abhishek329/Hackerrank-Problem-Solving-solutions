# Hackerrank-Problem-Solving-solutions
package com.programs;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);

	}

	private static int migratoryBirds(int n, int[] ar) {
	     int count=0;
	     
	     String s="";
	     for(int i=0;i<ar.length;i++)
	     {
	    	 String a=Integer.toString(ar[i]);
	    	 s=s+a;
	     }
	     
	     //System.out.println(s);
	     for(int i=0;i<s.length()-1;i++)
	     {
	    	 if(s.charAt(i)==s.charAt(i++))
	    	 {
	    		 count++;
	    	 }
	     }
	     
	   
		System.out.println(s.charAt(count));
		int ind= Character.getNumericValue(s.charAt(count));
		System.out.println(ind);
		return ind;
	}

}

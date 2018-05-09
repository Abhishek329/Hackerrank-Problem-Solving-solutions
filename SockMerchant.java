package com.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {

	
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = sockMerchant(n, ar);
	        System.out.println(result);

	}

	private static int sockMerchant(int n, int[] ar) {
		
		
	
		int pair=0;
		
		for(int i=0;i<ar.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
				   
					count++;
				}
				
			}
			
			if(count>0 && count%2==0)
			{
				pair++;
			}
			
		}
	
		
		
		
		
		return pair;
	}

}

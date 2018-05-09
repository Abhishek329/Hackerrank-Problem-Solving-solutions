package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumPairs {

	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);

	}

	private static int divisibleSumPairs(int n, int k, int[] ar) {
		
	List<Integer> list= new ArrayList<Integer>();
	
	
	for(int i=0;i<n;i++)
	{
	
	for(int j=i+1;j<n;j++)
	{
		if((ar[i]+ar[j])%k==0)
		{
			list.add(ar[i]);
			list.add(ar[j]);
			
		}
		/*else
		{
			System.out.println(ar[i]+" "+ar[j]);
		}*/
	}			
			
		
		
	}
	
	
		
	
	int number=list.size()/2;
	
	
		
		return number;
	}

}

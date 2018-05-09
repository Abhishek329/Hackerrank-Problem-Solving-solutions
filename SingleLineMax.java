package com.programs;

import java.util.Scanner;

public class SingleLineMax {


	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
    long[] arr= new long[n];
    
    int m = in.nextInt();
       
      for(int a0 = 0; a0 < m; a0++){
        int a = in.nextInt();
        int b = in.nextInt();
        long k = in.nextLong();
        if(a <=arr.length && b<=arr.length)
        {
        	for(int i=a-1;i<b;i++)
        	
        	
        	arr[i]=arr[i] + k;
      //if(a!=b)
      // arr[b-1]=arr[b-1]+ k;
      // System.out.println(arr[b-1]);
       
       
        }
          else
          {System.out.println("Enter the correct indexes for the insertion");
               break; }
      }
       
          
        	
        
    
    long temp = 0;
    for(int i=0;i<arr.length;i++)
    {
 // System.out.println(arr[i]);
    	if(arr[i]>temp)
    	{
    	
    		temp=arr[i];
    	}
    	
    	
    }
        
    System.out.println(temp);
    

}
}

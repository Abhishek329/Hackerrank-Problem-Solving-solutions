package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		
		//Pangrams p=new Pangrams();
		Scanner in= new Scanner(System.in);
		String input=in.nextLine();
		CheckPangram(input);
		

	}

	private static void CheckPangram(String input) {
	  
		List<Character> list= new ArrayList<>();
		List<Character> caplist= new ArrayList<>();
		HashMap<Character, Integer> map= new HashMap<>();
		Character[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//Character[] capalpha= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(Character c: alpha)
		{
			list.add(c);
		}
		
		/*for(Character a: capalpha)
		{
			caplist.add(a);
		}*/
		
		String inputTolowercase= input.toLowerCase();
		String[] output=inputTolowercase.split(" ");
		
		for(String s: output)
		{
			
			for(int i=0;i<s.length();i++)
			{
				
				if(list.contains(s.charAt(i)) || caplist.contains(s.charAt(i)))
				{
					if(!map.containsKey(s.charAt(i)))
					{
						map.put(s.charAt(i), 1);
					}
				}
			}
				
		}
		
		int sum=0;
		
		
		
		
		for(int s:map.values())
		{
			sum=sum+s;
		}
	    
		//System.out.println(sum);
		if(sum==26)
		{
			System.out.println("pangram");
		}
		else
			System.out.println("not pangram");
		
		
		
		
	}

}

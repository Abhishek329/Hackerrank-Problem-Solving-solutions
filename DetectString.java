package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DetectString {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            String result = hackerrankInString(s);
	            System.out.println(result);
	        }
	        in.close();

	}

	private static String hackerrankInString(String s) {
		
		String Yes = "Yes";
		String No ="No";
			
	  HashMap<Character, Integer> map= new HashMap<>();
	  map.put('h', 1);
	  map.put('a', 2);
	  map.put('c', 1);
	  map.put('k', 2);
	  map.put('e', 2);
	  map.put('r', 2);
	  map.put('n', 1);
		
		
	  List<Character> list= new ArrayList<>();
	  int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(map.containsKey(s.charAt(i)))
			{
				count=count+map.get(s.charAt(i));
				int value=map.get(s.charAt(i));
				if(count<=value)
				{
				
				list.add(s.charAt(i));
				}
				
				
			}
			
			
		}
		
		System.out.println(list);
		
		
		return Yes;
		
		
		
	}

}

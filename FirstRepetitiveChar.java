package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FirstRepetitiveChar {
	
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		String output=in.next();
		Character c=first(output);
		System.out.println("The first Repetitive character is "+c);
		
		
	}

	private static Character first(String output) {
		Character firstrepeat=null;
		Map<Character,Integer> map= new HashMap<>();
		List<Character> list= new ArrayList<>();
		for(char c:output.toCharArray())
		{
			int count =1;
			if(map.containsKey(c))
			{
				count=count + map.get(c);
			
			}
			map.put(c, count);
			
		}
		
		
		System.out.println(map);
		//System.out.println(list);
		
		
		
		for(char c: map.keySet())
		{
			if(map.get(c)==1)
			{
				return c;
			}
		}
		
			return firstrepeat;
	}
	

}

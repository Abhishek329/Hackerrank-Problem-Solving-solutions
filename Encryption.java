package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Encryption {
	
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	String input= sc.next();
	System.out.println("The encrypted String is : "+EncryptedOutput(input));
}

private static String EncryptedOutput(String input) {
    
	String output="";
	Map<Character,Integer> map= new HashMap<>();
	List<Character> list=new ArrayList<>();
	
	for(char c:input.toCharArray())
	{
		if(!map.containsKey(c))
		{
			map.put(c, 1);
			list.add(c);
		}
		else
		{
			map.put(c,map.get(c)+1);
		}
	}
		
		for(char c:list)
		{
		
			int count= map.get(c);
			output= output+c+""+count;
			
		}
		
		
	
	return output;
}

}

package com.programs;

import java.util.Scanner;

public class SplitTheFullName {
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String fullname=in.nextLine();
		String[] output=findname(fullname);
		System.out.println("Firstname "+output[0]+" LastName "+output[1]);
		in.close();
		
	}

	private static String[] findname(String fullname) {
		
		String[] output=new String[2];
		String[] names=fullname.split(" ");
		output[0]=names[0];
		if(names.length>1)
			output[1]=names[names.length-1];
		else
			output[1]="LNU";
		
		return output;
	}
	

}

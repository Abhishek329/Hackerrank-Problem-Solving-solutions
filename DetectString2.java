package com.programs;

import java.util.Scanner;

public class DetectString2 {

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
		
		String Yes="Yes";
		String No="No";
		
		String s2="hackerrank";
		int index=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s2.charAt(index))
			{
				index++;
			}
			
			if(index==s2.length())
			{
				return Yes;
			}
			
			
		}
		
		
		return No;
	}

}

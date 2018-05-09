package com.programs;

import java.util.HashMap;
import java.util.Scanner;

public class DesignerPDF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();

	}

	private static int designerPdfViewer(int[] h, String word) {
		// TODO Auto-generated method stub
		int max=0;
		
		for(int i=0;i<word.length();i++)
		{
			if(max <h[word.charAt(i)-97])
			{
				max=h[word.charAt(i)-97];
			}
		}
		
		int area= word.length() * max;
				
		return area;
	}

}

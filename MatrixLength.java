package com.programs;

public class MatrixLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	    int[][] result=RotateMatrix(mat);
		

	}

	private static int[][] RotateMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		int length=mat.length-1;
		int j=0;
		
		while(j<length/2)
		{
			for(int i=j;i<length-j;i++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[length-i][j];
				mat[length-i][j]=mat[length-j][length-i];
				mat[length-j][length-i]=mat[i][length-j];
				mat[i][length-j]= temp;
				
			}
			j++;
		}
		
		
		
		
		
		return null;
	}

}

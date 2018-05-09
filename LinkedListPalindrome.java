package com.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPalindrome {
  public static class Node{
	  int data;
	  Node next;
	  public Node(int data)
	  {
		  this.data=data;
	  }
	  
  }
	Node head;
	
	public Node Insertbeginning(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			
			head=n;
			head.next=null;
			
		}
		else
		{
			n.next=head;
			head=n;
			
		}
		
		
		return head;
		
	}
	
	
	
	
	public boolean CheckPalindrome()
	{
		Node n=head;
		ArrayList<Integer> list= new ArrayList<>();
		while(n!=null)
		{
			list.add(n.data);
			n=n.next;
			
			
		}
		
		int j=list.size()-1;
		
		for(int i=0;i<list.size();i++)
		{
		
				
			
			if(list.get(i)!=list.get(j))
			{
				return false;
			}
			
			j--;
		}
		
		return true;
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        LinkedListPalindrome pal= new LinkedListPalindrome();
        System.out.println("Enter the size of LinkedList");
        int size=in.nextInt();
        int input;
        for(int i=0;i<size;i++)
        {
          input=in.nextInt();
          pal.Insertbeginning(input);
        }
        /*pal.Insertbeginning(1);
        pal.Insertbeginning(2);
        pal.Insertbeginning(1);*/
        
        
       boolean Ispalindrome=pal.CheckPalindrome();
       System.out.println(Ispalindrome);

	}

}

package com.programs;

import java.util.Scanner;

public class LinkedListProgram {
	public static class Node
	{
		int data;
		Node next;
		private Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head;
	public Node insertbeginning(int new_data)
	{
		
		Node new_node= new Node(new_data);
		if(head==null) {
			head=new_node;
			head.next=null;
			return head;
		}
		
		new_node.next=head;
		head=new_node;
		return new_node;
		
	}
	
	public Node InsertAtPosition(int new_data,Node prev)
	{
		if(prev==null)
		{
			System.out.println("The previous node cannot be null");
			return prev;
		}
		
		Node new_node= new Node(new_data);
		new_node.next=prev.next;
		prev.next=new_node;	
		return new_node;
	}
	
	public Node InsertatEnd(int new_data)
	{
		Node new_node= new Node(new_data);
		Node last=head;
		if(head==null)
		{
			head=new_node;
			return head;
		}
		
		while(last!=null)
		{
			last=last.next;
			last.next=new_node;
			
		}
		
		return new_node;
				
	}
	
	public void PrintList()
	{
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
			
		}
	}
	
	
	

	public static void main(String[] args) {
		
	   LinkedListProgram lp= new LinkedListProgram();
	   Scanner in= new Scanner(System.in);
	   System.out.println("Enter the number of elemnents you want to insert at the beginning");
	   int beg=in.nextInt();
	   for(int i=0;i<beg;i++)
	   {
		   int elements;
		   elements=in.nextInt();
		   lp.insertbeginning(elements);
	   }
	   
	   System.out.println("The List is ");
	   lp.PrintList();
		

	}

}

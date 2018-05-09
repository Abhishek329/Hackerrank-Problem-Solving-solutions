package com.programs;

public class ReverseALinkedList {

	public static class Node{
		int data;
		Node next;
		private Node(int data)
		{
			this.data=data;
		}
	}
	Node head;
	
	
	
	public void ReverseList()
	{
		
	    Node temp=head;
	    Node prev=null;
	    Node n;
	    while(temp!=null)
	    {
	    	n=temp.next;
	    	temp.next=prev;
	    	prev=temp;
	    	temp=n;
	    }
	    head=prev;
		
	}
	
	public Node InsertElements(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{ 
			head=n;
			return head;	
			}
		else
		{
			n.next=head;
			head=n;
		}
		return head;
	}
	
	
	public void PrintList()
	{
		
	    Node n=head; 
		while(n!=null)
		{
			System.out.println(n.data+" ");
		     n=n.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		ReverseALinkedList rl= new ReverseALinkedList();
		rl.InsertElements(5);
		rl.InsertElements(4);
		rl.InsertElements(8);
		rl.PrintList();
		rl.ReverseList();
		rl.PrintList();
	   
	}

}

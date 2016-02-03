/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{
	Node head;
	class Node{
		Node next;
		int data;
		Node(int d){data=d;next=null;}
	}
	public void push(int d){
		Node newNode= new Node(d);
		newNode.next=head;
		head=newNode;
	}
	public void printList(){
		if(head==null){System.out.println("List empty.");return;}
		else{
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
	}
	public void delete(int d){
		if(head==null){System.out.println("List empty.");return;}
		else{
			if(head.data==d){head=head.next;return;}
			Node temp=head;
			Node prev=null;
			while(temp!=null && temp.data!=d){
			prev=temp;temp=temp.next;}
			if(temp==null){System.out.println("Not Found");return;}
			else {prev.next=temp.next;}
		}
		
	}
	public void deletePos(int d){
		if(d==0){head=head.next;return;}
		else{
			
			Node temp=head;
			Node prev=null;
			while(d>0 ){
			prev=temp;temp=temp.next;d--;}
			if(temp==null){System.out.println("Index Not Found");return;}
			else {prev.next=temp.next;}
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList llist = new LinkedList();
		llist.push(12);llist.push(14);
		llist.push(23);llist.push(25);
		llist.printList();
		llist.deletePos(0);
		llist.printList();
		// your code goes here
	}
}

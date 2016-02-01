/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hanoi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		Stack<Integer> C = new Stack<Integer>();
		Stack<Integer> Y;
		Stack<Integer> Z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # of Elements: ");
		int n=sc.nextInt();
		System.out.println("# of Elements: "+n);	// print # of Elements
		for(int i=n;i>0;i--)
			A.push(i);	
		System.out.println("Stack A : "+A);	//print stack
		//System.out.println(A.peek());
		int move[]=new int[n+1];
		
		if(n%2==0){
			Y=B;
			Z=C;
		}
		else{
			Y=C;
			Z=B;
		}
		//int i=2;
		System.out.println("Hanoi Start: ");
		while(!(A.empty() && B.empty())){
			if(A.search(1)!=-1)
				Y.push(A.pop());
			else if(Y.search(1)!=-1)
				Z.push(Y.pop());
			else if(Z.search(1)!=-1)
				A.push(Z.pop());
				move[1]+=1;
			System.out.println("A: "+A);
			System.out.println("B: "+B);
			System.out.println("C: "+C);
			System.out.println();
			
			for(int i=2;i<=n;i++){
				if (move[i-1]%2==1 && move[i-2]%2==0){
				//	System.out.println("yo");
					if(i%2==0){
					//	System.out.println("xfb");
						if(A.search(i)!=-1){
						//	System.out.println("tt");
							Z.push(A.pop());
						//	System.out.println("11");
							}
						else if(Z.search(i)!=-1){
							Y.push(Z.pop());
						//	System.out.println("22");
							}
						else if(Y.search(i)!=-1){
							A.push(Y.pop());
						//	System.out.println("33");
							}
							move[i]+=1;
					//	System.out.println("sdfcv");
					}
					else{
						if(A.search(i)!=-1)
							Y.push(A.pop());
						else if(Y.search(i)!=-1)
							Z.push(Y.pop());
						else if(Z.search(i)!=-1)
							A.push(Z.pop());
							move[i]+=1;
					}
					break;
				}
			}
			System.out.println("A: "+A);
			System.out.println("B: "+B);
			System.out.println("C: "+C);
			System.out.println();
		}
		System.out.println("Hanoi complete: "+C);
		
	}
}

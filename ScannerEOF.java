/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ScannerEOF
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str;
		while(sc.hasNextLine()){
			str=sc.nextLine();
			System.out.println(str);
		}
	}
}

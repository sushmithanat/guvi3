/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrli
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String[] c1=s1.split("#");
		String[] c2=s2.split("#");
		int mar1=0,mar2=0;
		for(int i=1;i<c1.length;i++)
		mar1 += Integer.parseInt(c1[i]);
		for(int i=1;i<c2.length;i++)
		mar2 += Integer.parseInt(c2[i]);
		if(mar1>mar2)
		System.out.print(c1[0]);
		else
		System.out.print(c2[0]);
	}
}

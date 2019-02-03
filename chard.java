/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chard
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length()/2;
		if(str.length()%2==1)
		{
			String s1="",s2="";
			int tmp=0;
			for(int i=0;i<n;i++)
			s1 += str.charAt(i);
			for(int i=n+1;i<str.length();i++)
			s2 += str.charAt(i);
			for(int i=0;i<n;i++)
			if(s1.charAt(i)==s2.charAt(i))
			tmp++;
			if(tmp==n)
			System.out.print("yes");
			else
			System.out.print("no");
		}
		else
		System.out.print("no");
	}
}

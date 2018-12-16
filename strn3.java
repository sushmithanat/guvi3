/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strn3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		for(int i=0;i<str.length()-n;i++)
		{
			System.out.print(str.substring(i,i+n)+" ");
		}
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		s += str.charAt(i);
		String st="";
		for(int i=0;i<n;i++)
		st += s.charAt(i);
		for(int i=st.length()-1;i>=0;i--)
		System.out.print(st.charAt(i));
	}
}

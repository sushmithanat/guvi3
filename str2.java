/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class str2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split(" ");
		int n=0;
		String[] s1=new String[s.length];
		for(int i=0;i<s.length;i++)
		{
		s1[i]=s[i];
		n++;
		}
		for(int i=n-1;i>=0;i--)
		{
			if(i==0)
			{
			System.out.print(s1[i]);
			break;
			}
			else
			System.out.print(s1[i]+" ");
		}
		
	}
}

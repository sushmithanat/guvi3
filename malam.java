/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class malam
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		String str1="";
			for(int i=str.length()-1;i>=0;i--)
			str1 += str.charAt(i);
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==str1.charAt(i))
				{
				count=0;
				}
				else
				{
					count=1;
					break;
				}
			}
			if(count==0)
			System.out.print("YES");
			else
			System.out.print("NO");
	}
}

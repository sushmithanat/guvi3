/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class subin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String st=sc.next();
		int cnt=0;
		if(str.contains(st))
		{
			for(int i=0,j=0;i<str.length();i++)
			{
				if(str.charAt(i)==st.charAt(j))
				{
				System.out.print(i);
				cnt=1;
				break;
				}
			}
		}
		//System.out.print("yes");
		if(cnt==0)
		System.out.print("-1");
	}
}

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pstr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		str[i]=sc.next();
		String st=sc.next();
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(str[i].charAt(0)==st.charAt(0) && str[i].charAt(1)==st.charAt(1))
			cnt++;
		}
		System.out.print(cnt);
	}
}

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class mulstr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s=sc.next();
		long l1=Integer.parseInt(str);
		long l2=Integer.parseInt(s);
		long mul=l1*l2;
		String ss=new Long(mul).toString();
		System.out.print(ss);
	}
}

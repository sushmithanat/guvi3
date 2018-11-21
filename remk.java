/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class remk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int[] b=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=k)
			b[j++]=a[i];
		}
		for(int i=0;i<j;i++)
		{
			if(i==j-1)
			System.out.print(b[i]);
			else
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrindb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int count=0,count1=0,j=0;
		for(int i=0;i<n;i++)
		{
			if(i==a[i])
			{
			count1++;
			count++;
			}
		}
		int[] b=new int[count1];
		for(int i=0;i<n;i++)
		{
			if(i==a[i])
			{
			b[j++]=a[i];
			}
		}
		Arrays.sort(b);
		if(count1>0)
		{
		for(int i=0;i<count1;i++)
		{
				if(count==1)
				{
					System.out.print(b[i]);
					break;
				}
				else
				{
					System.out.print(b[i]);
					System.out.print(" ");
					count--;
				}
		}
		}
		else
		{
			int min=-1;
			System.out.print(min);
		}
		
	}
}

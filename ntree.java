/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ntree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int max=0,min=0,cnt=0;
		if(x<y)
		{
			min=x;
			max=y;
		}
		else
		{
			min=y;
			max=x;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==min)
			{
			System.out.print(min);
			cnt++;
			break;
			}
		}
		if(cnt==0)
		{
			for(int i=0;i<n;i++)
		{
			if(a[i]==max)
			{
			System.out.print(max);
			break;
			}
		}
		}
		}
}

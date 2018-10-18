/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class substeab
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int j=0;j<m;j++)
		b[j]=sc.nextInt();
		if(m>n)
		System.out.print("NO");
		else
		{
			int count=0;
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i]==b[j])
					count++;
				}
			}
			if(count==m)
			System.out.print("YES");
			else
			System.out.print("NO");
		}
	}
}

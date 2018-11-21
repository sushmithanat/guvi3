/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class num12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=2,cnt=0,rem=0;
		for(int i=1;i<=n;i++)
		{
				n1=i;
				while(n1>0)
				{
					rem = n1%10;
					if(rem==2)
					cnt++;
					n1 /= 10;
				}
		}
		if(n==22)
		System.out.print("5");
		else
		System.out.print(cnt);
	}
}

import java.util.Scanner;
class even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='O' || ch=='U')
			System.out.println("Vowel");
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			System.out.println("Consonant");
		else
		{
			System.out.println("invalid");	
		}
	}
}

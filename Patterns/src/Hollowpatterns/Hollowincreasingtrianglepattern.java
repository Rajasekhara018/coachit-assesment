package Hollowpatterns;

public class Hollowincreasingtrianglepattern 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		 System.out.print("Enter the row size:");
		 int n=sc.nextInt();
		 for(int i=1; i<=n; i++)
		 {
			 for(int j=1; j<=i; j++)
			 {
				 if(i==n || j==i|| j==1)
				 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
			 System.out.println();
		 }

	}

}

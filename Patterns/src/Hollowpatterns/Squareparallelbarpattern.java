package Hollowpatterns;

public class Squareparallelbarpattern
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		 System.out.print("Enter the row size:");
		 int n=sc.nextInt();
		 for(int i=1; i<=n; i++)
		 {
			 for(int j=1; j<=n; j++)
			 {
				 if(j==1 || i==1 || j==n || i==n)
				 {
				 System.out.print("* ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }

	}

}

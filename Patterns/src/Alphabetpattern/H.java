package Alphabetpattern;

public class H 
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
				if(i==n/2+1 || j==1 || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

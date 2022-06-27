import java.util.Scanner;
public class second_largest_element_in_an_array 
{
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.print("Array elements:");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j]-(a[j]=a[i]);
				}
			}
		}
		System.out.print("Second largets elemnt in an array:"+a[a.length-2]);
	}
}

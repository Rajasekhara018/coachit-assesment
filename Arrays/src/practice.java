
public class practice 
{
    static java.util.Scanner sc = new java.util.Scanner(System.in); 
	public static void main(String[] args) 
	{
		int [] a= new int[5];
		int [] b=new int[5];
		int[] c=new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=a[i]+b[i];
		System.out.print(c[i]);
		}
	}

}

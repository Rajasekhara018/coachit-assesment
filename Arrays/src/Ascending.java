import java.lang.reflect.Array;

public class Ascending 
{

	public static void main(String[] args) 
	{
		/*int a=10;
		int b=9;
		int c=a;
	    a=b;
		b=c;
		System.out.println(a);
		System.out.print(b);*/
		
		/*int a[]= {3,1,8,6,9};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>a[i+1])
			

				int a=10;
				int b=9;
				int c=a;
			    a=b;
				b=c;
				System.out.println(a);
				System.out.print(b);*/
				int a[]= {5,24,7,9,3};
				for(int i=0; i<a.length; i++)
				{
					for(int j=i+1; j<a.length; j++)
					{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[i+1];
						a[j]=temp;
					}
					
				}
					for(int k=0; k<a.length;k++)
					{
						System.out.print(a[k]+" ");
					}
		}
	}
}


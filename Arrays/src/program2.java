
public class program2 
{

	public static void main(String[] args) 
	{
		int array[] = {10,20,30};
		int sum=0;
		int c=0;
		System.out.print("sum of array elements =");
		for(int i=0; i<array.length; i++)
		{
			c++;
			sum=sum+array[i];
			if(c==1)
			System.out.print(array[i]);
			else
			System.out.print("+"+array[i]);
		}
		System.out.print("="+sum);

	}

}

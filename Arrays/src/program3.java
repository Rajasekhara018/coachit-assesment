
public class program3 
{

	public static void main(String[] args) 
	{
		int array[] = {10, 20, 30, 40, 50};
		int sum=0;
		int count=0;
		System.out.print("sum of array elements=");
		for(int i=0; i<array.length; i++)
		{
			count++;
			sum=sum+array[i];
			if(count==1)
			System.out.print(array[i]);
			else
			System.out.print("+"+array[i]);
		}
		System.out.print("="+sum);
		System.out.println();
		System.out.print("average of array elements="+sum+"/"+ count +"="+(float)sum/count);

	}

}

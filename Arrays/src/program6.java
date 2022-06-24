
public class program6 
{

	public static void main(String[] args) 
	{
		int array[] = {11, 12, 13, 14, 15};
		int count=0;
		System.out.print("Count of the even number =");
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				count++;
			}
		}
		System.out.print(" "+c);
		System.out.println();
		 count=0;
		System.out.print("Count of the odd number =");
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2!=0)
			{
				count++;
			}
		}
		System.out.print(" "+count);

	}

}

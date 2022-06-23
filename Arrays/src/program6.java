
public class program6 
{

	public static void main(String[] args) 
	{
		int array[] = {11, 12, 13, 14, 15};
		int c=0;
		System.out.print("Count of the even number =");
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				c++;
			}
		}
		System.out.print(" "+c);
		System.out.println();
		 c=0;
		System.out.print("Count of the odd number =");
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2!=0)
			{
				c++;
			}
		}
		System.out.print(" "+c);

	}

}


public class program5 
{

	public static void main(String[] args) 
	{
		int array[] = {10, 5, -15, 20, -30};
		int largest=array[0];
		for(int i=1; i<array.length; i++)
		{
			if(array[i]>largest)
			{
				largest=array[i];
			}
		}
		
	System.out.println("Largest element= "+largest); 
	}

}
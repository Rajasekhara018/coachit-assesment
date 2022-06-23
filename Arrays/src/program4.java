
public class program4 {

	public static void main(String[] args) 
	{
		int array1[] = {10, 20, 30, 40, 50};
		int array2[] = {9, 18, 27, 36, 45};
		int array3[]= { };
		int i;
		for(i=0; i<5; i++)
		{
		array3 [i]= array1[i]+ array2[i];
		System.out.print(array3[i]);
		}
	}

}

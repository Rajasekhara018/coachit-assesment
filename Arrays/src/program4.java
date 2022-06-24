
public class program4 {

	public static void main(String[] args) 
	{
		int array1[] = {10,20,30,40,50};
		int array2[] = {9,18,27,36,45};
		int array3[]= new int[array1.length];
		int count=0;
		System.out.print("The resultant array will be= {");
		for(int i=0; i<array1.length; i++)
		{
		array3 [i]= array1[i]+ array2[i];
		count++;
		if(count==1)
		System.out.print(array3[i]);
		else
		System.out.print(","+array3[i]);
		}
		System.out.print("};");
	}

}

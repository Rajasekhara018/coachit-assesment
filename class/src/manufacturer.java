
public class manufacturer 
{
static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		Bike honda = new Bike();
		
		honda.modelname=sc.next();
		honda.manufacturer=sc.next();
		honda.fueltype=sc.next();
		honda.GearBox=sc.next();
		honda.cost=sc.nextInt();
		honda.company_of_origin =sc.next();
		
		System.out.print('\n'+"model name:"+honda.modelname);
		System.out.print('\n'+"manufacturer:"+honda.manufacturer);
		System.out.print('\n' +"fuel type:"+honda.fueltype);
		System.out.print('\n' +"Gear Box:"+honda.GearBox);
		System.out.print('\n' +"cost:"+honda.cost);
		System.out.print('\n' +"company of origin:"+honda.company_of_origin);
		
		/*honda.Smoothride();
		honda.maxweight();
		honda.protection();*/
		
		/*Bike hero = new Bike("Hero CD Deluxe","hero","petrol","4 gear box","75kmph",75000);
		
		System.out.println("modelname:"+hero.modelname);
		System.out.println("manufacturer:"+hero.manufacturer);
		System.out.println("fueltype:"+hero.fueltype);
		System.out.println("cost:"+hero.cost);
		System.out.println("mileage:"+hero.mileage);
		System.out.println("Gearbox:"+hero.GearBox);
		
				*/
	}

}

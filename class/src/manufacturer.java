
public class manufacturer 
{

	public static void main(String[] args) 
	{
		Bike honda = new Bike();
		
		honda.modelname="Honda shine 125cc";
		honda.manufacturer="Honda";
		honda.fueltype="petrol";
		honda.GearBox="5 Gears";
		honda.cost=95000;
		
		System.out.println("model name:"+honda.modelname);
		System.out.println("manufacturer:"+honda.manufacturer);
		System.out.println("fuel type:"+honda.fueltype);
		
		
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

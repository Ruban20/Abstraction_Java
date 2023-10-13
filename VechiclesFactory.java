package Abstraction_program;

public class VechiclesFactory {
public static Vechicle getinstanceVechicle(String s)
{
if (s.equals("Bike"))	
{
return new Bike();
}
else if(s.equals("Car"))
		{
			return new Car();
}
		else if(s.equals("Bus"))
		{
			return new Bus();
		}
		else
		{
			return null;
		}
}


}

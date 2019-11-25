package p_04_BuilderPattern;

/**
 * Create concrete classes extending Burger and ColdDrink classes
 * @author qianchen
 *
 */
public class VegBurger extends Burger
{
	@ Override
	public float price()
	{
		return 25.0f; 
	}
	
	@ Override
	public String name()
	{
		return "Veg Burger"; 
	}

}

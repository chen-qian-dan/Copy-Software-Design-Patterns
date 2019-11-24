package p_04_BuilderPattern;

/**
 * Create abstract classes implementing the item interface providing default functionalities. 
 * @author qianchen
 *
 */
public abstract class Burger implements Item
{
	@ Override
	public Packing packing()
	{
		return new Wrapper(); 
	}
	
	@ Override
	public abstract float price(); 

}

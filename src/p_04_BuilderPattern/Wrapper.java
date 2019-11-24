package p_04_BuilderPattern;


/**
 * Create concrete classes implementing the Packing interface; 
 * @author qianchen
 *
 */
public class Wrapper implements Packing
{

	@ Override
	public String pack()
	{
		return "Wrapper"; 
	}
	
}

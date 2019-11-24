package p_04_BuilderPattern;


/**
 * Create an interface Item representing food item and packing. 
 * @author qianchen
 *
 */
public interface Item 
{
	public String name(); 
	public Packing packing(); 
	public float price(); 

}

package p_04_BuilderPattern;



public abstract class CodeDrink implements Item
{

	@ Override
	public Packing packing()
	{
		return new Bottle(); 
	}
	
	@ Override
	public abstract float price(); 
}
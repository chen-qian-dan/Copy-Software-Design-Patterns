package p_04_BuilderPattern;

/**
 * Create a MealBuilder class, the actual builder class responsible to create Meal objects. 
 * @author qianchen
 *
 */
public class MealBuilder 
{
	public Meal prepareVegMeal()
	{
		Meal meal = new Meal(); 
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal; 
	}
	
	public Meal prepareNonVegMeal()
	{
		Meal meal = new Meal(); 
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal; 
	}

}

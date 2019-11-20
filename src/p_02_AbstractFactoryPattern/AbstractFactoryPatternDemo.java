package p_02_AbstractFactoryPattern;



/**
 * Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing an information such as type. 
 * @author qianchen
 *
 */
public class AbstractFactoryPatternDemo 
{

	public static void main(String[] args) 
	{
		// get rounded shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false); 
		
		Shape shape1 = shapeFactory.getShape("Rectangle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Square"); 
		shape2.draw(); 
		
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true); 
		
		Shape shape3 = shapeFactory1.getShape("Rectangle"); 
		shape3.draw();
			
		Shape shape4 = shapeFactory1.getShape("Square"); 
		shape4.draw();

				

	}

}

package p_02_AbstractFactoryPattern;


/***
 * Create an Abstract class to get factories for Normal and Rounded Shape Objects. 
 * @author qianchen
 *
 */
public abstract class AbstractFactory 
{
	abstract Shape getShape(String shapeType); 

}

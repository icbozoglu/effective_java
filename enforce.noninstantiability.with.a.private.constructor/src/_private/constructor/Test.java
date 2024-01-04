/*
 * Attempting to enforce noninstantiability by making a class abstract does not work. 
 * The class can be subclassed and the subclass instantiated. 
 * Furthermore, it misleads the user into thinking the class was designed for inheritance (Item 19). 
 * There is, however, a simple idiom to ensure noninstantiability. 
 * A default construc- tor is generated only if a class contains no explicit constructors, 
 * so a class can be made noninstantiable by including a private constructor:
 */

package _private.constructor;

import _private.constructor.model.AbstractClass;
import _private.constructor.model.ConcreteClass;

public class Test {
	public static void main(String[] args) {
		//noninstantiability
		//AbstractClass abstractClass = new AbstractClass();
		
		//The class can be subclassed and the subclass instantiated.
		ConcreteClass concreteClass = new ConcreteClass();
	}
}

package creating.and.destroying.objects.model;

import java.util.Collection;

/*
 * Item 1: Consider static factory methods instead of constructors
 * a static method that returns an instance of the class
 * static factory method is not the same as the Factory Method pattern from Design Patterns
 * 
 * One advantage of static factory methods is that, unlike constructors, they have names.
 * 
 * A second advantage of static factory methods is that, unlike constructors, 
 * they are not required to create a new object each time they’re invoked.
 * This technique is similar to the Flyweight pattern [Gamma95]. It can greatly improve performance 
 * if equivalent objects are requested often, especially if they are expensive to create.
 * Classes that do this are said to be instance-controlled.
 * Instance control allows a class to guarantee that it is a singleton (Item 3) or 
 * noninstantiable (Item 4). Also, it allows an immutable value class (Item 17) 
 * to make the guarantee that no two equal instances exist: a.equals(b) 
 * if and only if a == b. This is the basis of the Flyweight pattern [Gamma95]. 
 * Enum types (Item 34) provide this guarantee.
 * 
 * A third advantage of static factory methods is that, 
 * unlike constructors, they can return an object of any subtype of their return type.
 * One application of this flexibility is that an API can return objects 
 * without making their classes public. Hiding implementation classes in 
 * this fashion leads to a very compact API. This technique lends itself to 
 * interface-based frameworks (Item 20), 
 * where interfaces provide natural return types for static factory methods.
 * 
 * A fourth advantage of static factories is that the class of 
 * the returned object can vary from call to call as a function of the input parameters.
 * The EnumSet class (Item 36) has no public constructors, only static factories. 
 * In the OpenJDK implementation, they return an instance of one of two subclasses, 
 * depending on the size of the underlying enum type: if it has sixty-four or fewer elements, 
 * as most enum types do, the static factories return a RegularEnumSet instance, which is backed by a single long; 
 * if the enum type has sixty-five or more elements, the factories return a JumboEnumSet instance, backed by a long array.
 * The existence of these two implementation classes is invisible to clients. 
 * If RegularEnumSet ceased to offer performance advantages for small enum types, 
 * it could be eliminated from a future release with no ill effects. 
 * Similarly, a future release could add a third or fourth implementation of EnumSet if it proved beneficial
 */
public class StaticFactoryMethod extends SuperType implements Interface1 {

	private static StaticFactoryMethod staticFactoryMethod;

	private StaticFactoryMethod() {
	}

	public static StaticFactoryMethod of() {

		if (staticFactoryMethod != null) {
			staticFactoryMethod = new StaticFactoryMethod();
		}

		return staticFactoryMethod;
	}

	public static SuperType ofSuperType() {

		if (staticFactoryMethod != null) {
			staticFactoryMethod = new StaticFactoryMethod();
		}

		return staticFactoryMethod;
	}
	
	public static SuperType ofSuperType(boolean b) {

		if (b == true) {
			return new RegularSuperType();
		}else {
			return new ExtendedSuperType();
		}
	}
	
	public static Interface1 ofInterface() {

		if (staticFactoryMethod != null) {
			staticFactoryMethod = new StaticFactoryMethod();
		}

		return staticFactoryMethod;
	}
}

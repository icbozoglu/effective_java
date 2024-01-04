/*
 * Because the explicit constructor is private, it is inaccessible outside the class. 
 * The AssertionError isn’t strictly required, but it provides insurance 
 * in case the constructor is accidentally invoked from within the class. 
 * It guarantees the class will never be instantiated under any circumstances. 
 * This idiom is mildly counter- intuitive because the constructor is 
 * provided expressly so that it cannot be invoked. 
 * It is therefore wise to include a comment, as shown earlier.
 * As a side effect, this idiom also prevents the class from being subclassed. 
 * All constructors must invoke a superclass constructor, explicitly or implicitly, 
 * and a subclass would have no accessible superclass constructor to invoke.
 */
package _private.constructor.utility;

//Noninstantiable utility class
public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError();
	}
	// Remainder omitted
}
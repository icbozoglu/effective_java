/*
 * Static utility classes and singletons are inappropriate for classes 
 * whose behavior is parameterized by an underlying resource.
 * What is required is the ability to support multiple instances of the class 
 * (in our example, SpellChecker), each of which uses the resource desired by the client 
 * (in our example, the dictionary). 
 * A simple pattern that satisfies this requirement is to pass the resource into the constructor 
 * when creating a new instance.
 * 
 * In summary, do not use a singleton or static utility class to implement a class that 
 * depends on one or more underlying resources whose behavior affects that of the class, 
 * and do not have the class create these resources directly. 
 * Instead, pass the resources, or factories to create them, 
 * into the constructor (or static factory or builder). 
 * This practice, known as dependency injection, will greatly enhance 
 * the flexibility, reusability, and testability of a class.
 */
package refer.dependency.injection.to.hardwiring.resources;

import refer.dependency.injection.to.hardwiring.resources.model.Languge;
import refer.dependency.injection.to.hardwiring.resources.model.Lexicon;
import refer.dependency.injection.to.hardwiring.resources.utility.SpellChecker;

public class Test {
	
	Lexicon lexicon = new Lexicon(Languge.TURKISH);
	SpellChecker spellChecker = new SpellChecker(lexicon);
	

}

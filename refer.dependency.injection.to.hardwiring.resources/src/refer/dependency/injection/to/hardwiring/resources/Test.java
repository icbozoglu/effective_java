/*
 * Static utility classes and singletons are inappropriate for classes 
 * whose behavior is parameterized by an underlying resource.
 * What is required is the ability to support multiple instances of the class 
 * (in our example, SpellChecker), each of which uses the resource desired by the client 
 * (in our example, the dictionary). 
 * A simple pattern that satisfies this requirement is to pass the resource into the constructor 
 * when creating a new instance.
 */
package refer.dependency.injection.to.hardwiring.resources;

public class Test {

}

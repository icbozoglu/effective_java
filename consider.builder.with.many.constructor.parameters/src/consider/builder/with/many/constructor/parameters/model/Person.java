/*
 * Item 2: Consider a builder when faced with many constructor parameters
 * Static factories and constructors share a limitation: 
 * they do not scale well to large numbers of optional parameters.
 * What sort of constructors or static factories should you write for such a class? 
 * Traditionally, programmers have used the telescoping constructor pattern, 
 * in which you provide a constructor with only the required parameters, 
 * another with a single optional parameter, a third with two optional parameters, and so on, 
 * culminating in a constructor with all the optional parameters
 * In short, the telescoping constructor pattern works, 
 * but it is hard to write client code when there are many parameters, and harder still to read it.
 * 
 * A second alternative when you’re faced with many optional parameters in a constructor is the JavaBeans pattern, 
 * in which you call a parameterless construc- tor to create the object and 
 * then call setter methods to set each required parameter and each optional parameter of interest:
 * This pattern has none of the disadvantages of the telescoping constructor pattern. It is easy, if a bit wordy, 
 * to create instances, and easy to read
 * This client code is easy to write and, more importantly, easy to read. 
 * The Builder pattern simulates named optional parameters as found in Python and Scala.
 * 
 * Validity checks were omitted for brevity. To detect invalid parameters as soon as possible, 
 * check parameter validity in the builder’s constructor and methods. 
 * Check invariants involving multiple parameters in the constructor invoked by the build method. 
 * To ensure these invariants against attack, do the checks on object fields after copying parameters 
 * from the builder (Item 50). If a check fails, throw an IllegalArgumentException (Item 72) 
 * whose detail message indicates which parameters are invalid (Item 75).
 * 
 */

package consider.builder.with.many.constructor.parameters.model;

import java.time.LocalDate;

public class Person {

	private final long id;
	private final String firstName;
	private final String lastName;
	private final LocalDate birthDate;
	private final boolean married;

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public boolean isMarried() {
		return married;
	}

	private Person(Builder builder) {

		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.birthDate = builder.birthDate;
		this.married = builder.married;

	}

	public static class Builder {

		private long id;
		private final String firstName;
		private final String lastName;
		private LocalDate birthDate;
		private final boolean married;

		public Builder(String firstName, String lastName, boolean married) {

			this.firstName = firstName;
			this.lastName = lastName;
			this.married = married;
		}

		public Builder birthDate(LocalDate birthDate) {
			if(birthDate == null ||birthDate.getYear()-LocalDate.now().getYear() < 18)
				throw new IllegalArgumentException("The age cannot be under 18!");
			
			this.birthDate = birthDate;
			return this;
		}

		public Builder id(long id) {
			this.id = id;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", married=" + married + "]";
	}

}

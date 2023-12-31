package consider.builder.with.many.constructor.parameters;

import java.time.LocalDate;

import consider.builder.with.many.constructor.parameters.model.Person;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person.Builder("Ali","Veli",true).birthDate(LocalDate.now()).build();
		
		System.out.println(person);

	}

}

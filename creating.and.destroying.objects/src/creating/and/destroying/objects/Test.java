package creating.and.destroying.objects;

import java.time.LocalDate;

import creating.and.destroying.objects.model.GenericFactory;
import creating.and.destroying.objects.model.Person;

public class Test {

	public static void main(String[] args) {

		GenericFactory<String> factory = GenericFactory.createInstance("Hello, Generics!");
		factory.performAction();

		GenericFactory<Integer> factory2 = GenericFactory.createInstance(123);
		factory2.performAction();
		
		GenericFactory<Person> factory3 = GenericFactory.createInstance(new Person(1,"Ali","Veli",LocalDate.now(),false));
		factory3.performAction();
	}

}

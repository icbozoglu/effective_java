package creating.and.destroying.objects;

import java.time.LocalDate;

import creating.and.destroying.objects.model.GenericFactory;
import creating.and.destroying.objects.model.Interface1;
import creating.and.destroying.objects.model.Person;
import creating.and.destroying.objects.model.StaticFactoryMethod;
import creating.and.destroying.objects.model.SuperType;

public class Test {

	public static void main(String[] args) {
		
		StaticFactoryMethod method1 = StaticFactoryMethod.of();
		Interface1 method2 = StaticFactoryMethod.ofInterface();
		SuperType method3 = StaticFactoryMethod.ofSuperType();
		SuperType method4 = StaticFactoryMethod.ofSuperType(false);
		
		GenericFactory<String> factory1 = GenericFactory.createInstance("Hello, Generics!");
		factory1.performAction();

		GenericFactory<Integer> factory2 = GenericFactory.createInstance(123);
		factory2.performAction();
		
		GenericFactory<Person> factory3 = GenericFactory.createInstance(new Person(1,"Ali","Veli",LocalDate.now(),false));
		factory3.performAction();
	}

}

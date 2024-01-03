/*
 * A singleton is simply a class that is instantiated exactly once [Gamma95]. 
 * Singletons typically represent either a stateless object such as a function 
 * (Item 24) or a system component that is intrinsically unique. 
 * Making a class a singleton can make it difficult to test its clients 
 * because it’s impossible to substitute a mock implementation for a singleton 
 * unless it implements an interface that serves as its type.
 * 
 * Nothing that a client does can change this,
 * with one caveat: a privileged client can invoke 
 * the private constructor reflectively (Item 65) with the aid of the 
 * AccessibleObject.setAccessible method. If you need to defend against this attack,
 * modify the constructor to make it throw an exception if it’s asked 
 * to create a second instance
 */
package singleton;

import singleton.model.EnumSingleton;
import singleton.model.FinalFieldSingleton;
import singleton.model.StaticFactoryEager;
import singleton.model.StaticFactoryLazy;

public class Test {

	public static void main(String[] args) {
		
		FinalFieldSingleton singleton1 = FinalFieldSingleton.INSTANCE;
		FinalFieldSingleton singleton2 = FinalFieldSingleton.INSTANCE;
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		
		StaticFactoryEager singleton3 = StaticFactoryEager.getInstance();
		StaticFactoryLazy singleton4 = StaticFactoryLazy.getInstance();
		
		EnumSingleton singleton5 = EnumSingleton.INSTANCE;
		EnumSingleton singleton6 = EnumSingleton.INSTANCE;
		
		System.out.println(singleton5.hashCode());
		System.out.println(singleton6.hashCode());
		
		singleton5.doSomethingUseful();
		

	}

}

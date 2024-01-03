package singleton.model;

public class FinalFieldSingleton {
	
	public static final FinalFieldSingleton INSTANCE = new FinalFieldSingleton();
	
	private FinalFieldSingleton() {}

	public void doSomethingUseful() {
		System.out.println("Useful thing has been done.");
	}
}

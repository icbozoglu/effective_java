package singleton.model;

public class StaticFactoryEager {
	
	private static final StaticFactoryEager INSTANCE = new StaticFactoryEager();
	
	private StaticFactoryEager() {}
	
	public static StaticFactoryEager getInstance() { return INSTANCE; }
	
	public void doSomethingUseful() {
		System.out.println("Useful thing has been done.");
	}
}

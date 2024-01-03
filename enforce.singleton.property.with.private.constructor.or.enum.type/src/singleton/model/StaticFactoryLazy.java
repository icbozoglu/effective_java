package singleton.model;

public class StaticFactoryLazy {

	private static StaticFactoryLazy instance;

	private StaticFactoryLazy() {
	}

	public static StaticFactoryLazy getInstance() {
		if (instance == null)
			instance = new StaticFactoryLazy();

		return instance;
	}

	public void doSomethingUseful() {
		System.out.println("Useful thing has been done.");
	}
}

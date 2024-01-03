package singleton.cache.sample;

import singleton.cache.sample.model.*;

public class Test {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println(LazyCache.getInstance().hashCode());
				System.out.println(EagerCache.getInstance().hashCode());
				System.out.println(EnumCache.INSTANCE.hashCode());

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(LazyCache.getInstance().hashCode());
				System.out.println(EagerCache.getInstance().hashCode());
				System.out.println(EnumCache.INSTANCE.hashCode());

			}
		}).start();

	}

}

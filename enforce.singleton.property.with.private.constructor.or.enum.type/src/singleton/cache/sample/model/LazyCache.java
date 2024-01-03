package singleton.cache.sample.model;

import java.util.HashMap;
import java.util.Map;

public class LazyCache implements MyCache{

	private static LazyCache instance;
	
	public static LazyCache getInstance() {
		if(instance == null)
			instance = new LazyCache();
		
		return instance;
	}
	
	private Map<Object, Object> map;
	
	private LazyCache() {
		map = new HashMap<>();
	}
	@Override
	public void put(Object key, Object value) {
		map.put(key, value);
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return map.get(key);
	}

}

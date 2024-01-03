package singleton.cache.sample.model;

import java.util.HashMap;
import java.util.Map;

public class EagerCache implements MyCache{

	private static final EagerCache instance = new EagerCache();
	
	public static EagerCache getInstance() {
		return instance;
	}
	
	private Map<Object, Object> map;
	
	private EagerCache() {
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

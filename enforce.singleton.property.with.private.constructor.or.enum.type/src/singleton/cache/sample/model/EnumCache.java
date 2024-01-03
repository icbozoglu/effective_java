package singleton.cache.sample.model;

import java.util.HashMap;
import java.util.Map;

public enum EnumCache implements MyCache {
	INSTANCE;

	private Map<Object, Object> map;

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

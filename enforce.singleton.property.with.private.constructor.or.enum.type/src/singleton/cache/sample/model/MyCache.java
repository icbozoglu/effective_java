package singleton.cache.sample.model;

public interface MyCache<K,V> {
	
	public void put(K key, V value);
	public V get(K key);

}

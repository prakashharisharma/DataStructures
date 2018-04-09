package com.td.ds.misc;

public class LRUCacheTest {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(5);
		cache.put(1, 1);
		cache.printCacheElements();
		cache.put(2, 2);
		cache.put(3, 3);
		cache.put(4, 4);
		cache.put(5, 5);
		cache.printCacheElements();
		cache.put(6, 6);
		cache.printCacheElements();
		cache.get(2);
		cache.printCacheElements();
		cache.put(7, 7);
		cache.printCacheElements();
		cache.put(7, 7);
		cache.printCacheElements();
	}
}

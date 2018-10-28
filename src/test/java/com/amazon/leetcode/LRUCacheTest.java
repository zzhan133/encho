package com.amazon.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LRUCacheTest {
	@Test
	public void testGet() throws Exception {
		LRUCache cache = new LRUCache(2 /* capacity */ );

		cache.put(1, 1);
		cache.put(2, 2);
		assertEquals(1, cache.get(1)); // returns 1
		System.out.println("" + cache);
		cache.put(3, 3); // evicts key 2
		System.out.println("" + cache);
		assertEquals(-1, cache.get(2)); // returns -1 (not found)
		cache.put(4, 4); // evicts key 1
		assertEquals(-1, cache.get(1)); // returns -1 (not found)
		assertEquals(3, cache.get(3)); // returns 3
		assertEquals(4, cache.get(4)); // returns 4
	}

	@Test
	public void testPut() throws Exception {
		LRUCache cache = new LRUCache(2 /* capacity */ );

		cache.put(2, 1);
		cache.put(1, 2);
		assertEquals(2, cache.get(1)); // returns 1
		System.out.println("" + cache);
		cache.put(2, 3); // evicts key 2
		System.out.println("" + cache);
		assertEquals(3, cache.get(2)); // returns -1 (not found)
		cache.put(4, 1); // evicts key 1
		System.out.println("" + cache);
		assertEquals(-1, cache.get(1)); // returns -1 (not found)
		assertEquals(3, cache.get(2)); // returns 3
	}

}

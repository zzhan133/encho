package com.amazon.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	private int size;

	private LinkedHashMap<Integer, Integer> map;

	public LRUCache(int size) {
		this.size = size;
		map = new LinkedHashMap<Integer, Integer>() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
				return size() > size;
			}
		};
	}

	public int get(int key) {
		Integer val = map.getOrDefault(key, -1);
		if (val != -1) {
			map.remove(key);
			map.put(key, val);
		}
		return val;
	}

	public void put(int key, int val) {
		map.put(key, val);
	}

	@Override
	public String toString() {
		return "LRUCache [size=" + size + ", map=" + map + "]";
	}

}

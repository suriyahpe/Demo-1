package com.hpe.cache.interf;

public interface CacheInterface {

	public String getCache(int key);
	public void addCache(int key,String value);
	public boolean delCache(int key);
	public boolean update(int key,String value);
}

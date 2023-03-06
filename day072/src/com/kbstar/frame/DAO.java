package com.kbstar.frame;

public interface DAO <K, V> {   // Generic - <Key, Value>
	public void insert(V v);   // key 혹은 value 중 어떤 값이 들어올 건지 넣어주면 됨
	public void delete(K k);
	public void update(V v);
	

}

package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	/* CRUD (Create, Read, Update, Delete) */
	public void insert(V v) throws Exception;  //create
	public void update(V v) throws Exception;  //update
	public void delete(K k) throws Exception;  //delete
	public V select(K k) throws Exception;     //read
	public List<V> select() throws Exception;  //read

}

package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	/*------------------ DB 생성 ---------------------*/
	HashMap<String, UserDTO> db;
	
	public UserDAO() {
		db = new HashMap<>();
	}
	
	/*------------------ insert ---------------------*/
	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("DB Error");
		}
		db.put(v.getId(), v);
		
	}
	
	/*------------------ delete---------------------*/
	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception();
		}
		db.remove(k);
		
	}
	
	/*------------------ update ---------------------*/
	@Override
	public void update(UserDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);		
	}
	
	/*------------------ Select ---------------------*/
	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null;
		obj = db.get(k);
		return obj;
	}
	
	
	/*------------------ Select All ---------------------*/
	@Override
	public List<UserDTO> select() throws Exception {
		if (db == null) {
			throw new Exception("DB ERROR 등록된 정보가 없습니다.");
		}
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		for (UserDTO obj : col) {
			list.add(obj);
		}
		
		return list;
	}
	
	

}

package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	@Override
	public void insert(ItemDTO v) throws Exception {
		connect();
		if(v.getId() == 1010) {
			throw new Exception("EX0004");
		}
		System.out.println(v);
		System.out.println("Inserted...");
		close();
	}

	@Override
	public void delete(Integer k) throws Exception {
		connect();
		if(k == 1010) {
			throw new Exception("EX0004");
		}
		System.out.println(k);
		System.out.println("Deleted...");
		close();
		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(v.getId() == 1010) {
			throw new Exception("EX0004");
		}
		System.out.println(v);
		System.out.println("Updated...");
		
	}
	

}

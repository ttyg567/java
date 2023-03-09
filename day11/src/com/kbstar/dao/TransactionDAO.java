package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO>{

	HashMap<String, TransactionDTO> db;
	
	public TransactionDAO() {
		db = new HashMap<>();
	}
	
	@Override
	public void insert(TransactionDTO v) throws Exception {
		if(db.containsKey(v.getDate())) {
			throw new Exception("같은 거래내역이 존재합니다.");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public void delete(String k) throws Exception {
			
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
			
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("입력하신 계좌는 없는 계좌입니다.");
		}
		TransactionDTO obj= null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		if(db == null) {
			throw new Exception("보유중인 계좌가 없습니다.");
		}
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col;
		col = db.values();
		for (TransactionDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

}
package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

// 여러개의 인터페이스를 같이 사용할 수 있다
public class ItemService implements Service<Integer, ItemDTO>, SearchService {

	DAO<Integer, ItemDTO> dao; 
	
	public ItemService() {
		dao = new ItemDAO();
	}
	
	@Override
	public void register(ItemDTO v) {
		System.out.println(v + "Data Check...");
		dao.insert(v);
		System.out.println("Send SMS...");
		
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + "Data Check...");
		dao.delete(k);
		System.out.println("Send SMS...");
		
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v + "Data Check...");
		dao.update(v);
		System.out.println("Send SMS...");
		
	}

	@Override
	public void search() {
		System.out.println("Item Search ...");
		
	}

	// Service 인터페이스에 추가했을 때
	// ItemService 외에 service 패키지에 있는 모든 클래스 들에 이거를 추가해줘야한다..
//	@Override
//	public void search() {
//		System.out.println("Search ...");
//		
//	}
	
	
	// Service 기능 추가 
//	public void search() {
//		System.out.println("Search ...");
//	}
	
	

}

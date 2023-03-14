package com.kbstar.test;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> Service = 
				new ItemCRUDServiceImpl();
		
		Item obj = new Item("ideddd", 20000, 2.2);
		try {
			Service.register(obj);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

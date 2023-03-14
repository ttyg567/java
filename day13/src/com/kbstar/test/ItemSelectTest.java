package com.kbstar.test;


import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service = 
				new ItemCRUDServiceImpl();


		Item obj = null;
		try {
			System.out.println(service.get("2023314195100"));
			System.out.println("get성공");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
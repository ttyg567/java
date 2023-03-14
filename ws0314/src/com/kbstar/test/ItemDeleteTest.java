package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemDeleteTest {

	public static void main(String[] args) {
			CRUDService<String, Item> Service =
					new ItemCRUDServiceImpl();
			
			try {
				Service.remove("2023314309100");
				System.out.println("성공");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

}

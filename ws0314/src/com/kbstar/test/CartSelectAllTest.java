package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> CartService = 
				new CartCRUDServiceImpl();
		
		Cart obj = new Cart("ideddd", "ddddef", 2);
		try {
			CartService.register(obj);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> Service = 
				new CartCRUDServiceImpl();
		
		Cart cart = new Cart("2023314506100", 33);
		try {
			Service.modify(cart);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

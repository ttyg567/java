package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;
import com.kbstar.service.UserService;

public class UserAccountCRUDTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj1 = new AccountDTO ("123456-66-123456", 10000, "jj"); 
		AccountDTO obj2 = new AccountDTO ("123456-66-654321", 10000, "jjyy"); 
		AccountDTO obj3 = new AccountDTO ("123456-66-135790", 10000, "jjyyoo"); 

		
		
		/* register ---------------------------------------------------*/
		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/* get(k) ---------------------------------------------------*/
		AccountDTO acc = null;
		try {
			acc = service.get("123456-66-123456");
			System.out.println(acc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* get( ) ---------------------------------------------------*/
		
		List<AccountDTO> list = null;
		try {
			list = service.get();
			for(AccountDTO a: list) {
				System.out.println(a);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* remove ---------------------------------------------------*/
		try {
			service.remove("123456-66-123456");
			System.out.println("----------remove-------------------");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<AccountDTO> list2 = null;
		try {
			list2 = service.get();
			for(AccountDTO a: list) {
				System.out.println(a);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

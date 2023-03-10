package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String>
		service = new BankServiceImpl();;
		
		// Register
		UserDTO user = 
				new UserDTO("id01", "pwd01", "name", "a@naver.com", "111");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// Login
		String id = "id01";
		String pwd = "pwd01";
		UserDTO loginUser = null;
		/*login 함수가 실행되면 UserDTO가 반환되니 이를 받을 준비*/
		try {
			loginUser = service.login(id, pwd);
			System.out.println("로그인 성공!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

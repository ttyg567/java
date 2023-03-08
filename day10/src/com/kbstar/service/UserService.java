package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service <String, UserDTO>{

	DAO<String, UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	
	@Override
	public void register(UserDTO v) throws Exception {
		System.out.println("Security Check...");
		/*dao.insert(v); // 예외 처리 내용이 여기로 들어옴
		 * 해결책: add throws declaration 
		 * UserService에서 catch-try 구문을 사용하면 
		 * 여기서 결과를 출력하고 끝나기 때문에
		 * 다시 App으로 보내줘야
		 * 고객에게 보이도록 출력할 수 있다.*/
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send Mail...");
		System.out.println("Send SMS...");
				
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
			/* 이런 형식으로 쓰는 이유는
			 * 이 자리에 다른 기능을 넣을 수 있기 때문
			 * 로그를 기록한다던지..(누가 접근했는지 알 수 있게,,)*/

		} 
		System.out.println("Send SMS...");
		
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS...");
		
	}
	
	
	// 인터페이스에 추가되었을 때는 사용안하더라도 추가해줘야한다.
//	@Override
//	public void search() {
//		// TODO Auto-generated method stub
//		
//	}


	

}

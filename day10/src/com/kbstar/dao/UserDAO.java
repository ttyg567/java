package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO <String, UserDTO>{  // frame 에서 넣은 K, V - key, value 값이 어떤 타입인지는 여기서 선언함

	
	/*예외 처리 - 동일한 아이디를 저장할 때 */
	@Override
	public void insert(UserDTO v) throws Exception  {  // 인터페이스에서 선언 안했는데 여기만 하면 오류남
		if(v.getId().equals("id01")) {
			throw new Exception("EX0004");
		}
		System.out.println(v.getId() + "님이 저장 되었습니다.");
		
	}

	@Override
	public void delete(String k) throws Exception {
		if(k.equals("id01")) {
			throw new Exception("EX0005");
		}
		System.out.println(k + "님이 삭제 되었습니다.");
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(v.getId().equals("id01")) {
			throw new Exception("EX0006");
		}
		System.out.println(v.getId() + "님의 정보가 수정 되었습니다.");
		
	}   

}

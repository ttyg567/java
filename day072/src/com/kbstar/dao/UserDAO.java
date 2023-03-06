package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO <String, UserDTO>{  // frame 에서 넣은 K, V - key, value 값이 어떤 타입인지는 여기서 선언함

	@Override
	public void insert(UserDTO v) {
		System.out.println(v.getId() + "님이 저장 되었습니다.");
		
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "님이 삭제 되었습니다.");
		
	}

	@Override
	public void update(UserDTO v) {
		System.out.println(v.getId() + "님의 정보가 수정 되었습니다.");
		
	}   

}

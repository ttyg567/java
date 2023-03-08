package com.kbstar.dto;

public class UserDTO {
	//데이터를 담아서 운반하는 역할
	// DAO에 전달
	
	private String id;
	private String pwd;
	private String name;
	
	// constructor
	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	// getter & setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// 출력
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	
	
	
	

}

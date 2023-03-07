package com.kbstar.frame;

public interface DAO <K, V> {  
	
	// 상수
	// 타입 상수명 = 값;
	//public static final String ip = "127.0.0.1";
	String IP = "127.0.0.1"; // 위 내용과 같음, 상수로 정보를 저장하는 것
	
	
	public void insert(V v);   
	public void delete(K k);
	public void update(V v); // public abstract void update() -> 추상 함수를 구현한 것임을 기억
	
	default void connect() {
		System.out.println(IP + " 에 접속 하였습니다.");
	}
	default void close() {
		System.out.println(IP + " 에 접속을 해제 하였습니다.");
	}
	

}

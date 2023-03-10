package com.kbstar.frame;

import java.util.List;

// / 누르고 ** 누르고 엔터 누르면 아래와 같이 자동 생성
/**
 * 23.3.10
 * @author jiye
 *
 * @param <V1> UserDTO
 * @param <V2> AcountDTO
 * @param <V3> TransactionDTO
 * @param <K> String id
 * @param <P> String pwd
 */

public interface BankService <V1, V2, V3, K, P> {
	
	public void register(V1 v) throws Exception;
	public V1 login(K k, P p) throws Exception;
	public V1 getUserInfo(K k) throws Exception;
	public void makeAccount(K k, double balance) throws Exception;
	public List<V2> getAllAccount(K k) throws Exception;
	public List<V3> getAllTr(String acc) throws Exception;
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;
	 
	

}

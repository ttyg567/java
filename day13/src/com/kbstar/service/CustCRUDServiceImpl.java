package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust>{

	DAO<String, String, Cust> dao;
	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

/*------------------------------Register------------------------------*/
	@Override
	public void register(Cust v) throws Exception {
		// 데이터 검증
		// DB 입력
		try {
			dao.insert(v);
		}catch(Exception e) {
			if(e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복 되었습니다.");

			}else {
				throw new Exception("시스템 장애 입니다.");

			}
		}
		// Email, SMS
	}
/*------------------------------Remove------------------------------*/
	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다..");
			} else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}	
	}
/*------------------------------Modify------------------------------*/
	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다..");
			}else {;
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
		
		
	}

	

	/*------------------------------Get------------------------------*/
	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null;
		try {
			cust = dao.select(k);
		} catch (Exception e) {
			if(e instanceof SQLRecoverableException) {
				// 서버에 연결 안된 경우
				throw new Exception("시스템 장애 입니다.");
			} else {
				throw new Exception("존재하지 않는 ID 입니다.");
			}
		}
		
		return cust;
	}

	
	/*------------------------------Get All------------------------------*/
	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;
		try {
			list = dao.selectAll();
		} catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				// 서버에 연결 안된 경우
				throw new Exception("시스템 장애 입니다.");
			} 
			
		}
		return list;
	}

}

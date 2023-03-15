package com.kbstar.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {

	DAO<String, String, Cart> dao;

	public CartCRUDServiceImpl() {
		dao = new CartDaoImpl();
	}

	/*------------------------------Register------------------------------*/
	@Override
	public void register(Cart v) throws Exception {
		try {
			String id = MakeItemNumber.makeCartNum();
			v.setId(id);
			dao.insert(v);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("오류");
		}

	}

	/*------------------------------Modify------------------------------*/
	@Override
	public void modify(Cart v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다..");
			} else {
				// e.printStackTrace();
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}

	}

	/*------------------------------Delete------------------------------*/
	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {

			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("시스템장애");
			} else {
				throw new Exception("해당 id가 존재하지 않습니다.");
			}
		}

	}/*------------------------------Get------------------------------*/	
	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		try {
			cart = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLException) {
				e.printStackTrace();
				throw new Exception("ID가 없습니다.");
			} else {
				// e.printStackTrace();
				throw new Exception("시스템 장애입니다.");
			}
		}
		return cart;
	}
	/*------------------------------Get All------------------------------*/	
	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = new ArrayList<>();
		try {
			dao = new CartDaoImpl();
			list = dao.selectAll();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			}
			e.printStackTrace();
		}
		return list;
	}

}

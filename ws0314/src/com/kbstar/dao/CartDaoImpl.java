package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {

/* Driver Loading --------------------------------------------------------- */
	public CartDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");
	}

/*------------------------------Insert------------------------------*/
	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.cartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUser_id());
			pstmt.setString(3, v.getItem_id());
			pstmt.setInt(4, v.getCnt());
			pstmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		}
	}
/*------------------------------Delete------------------------------*/
	@Override
		public void delete(String k) throws Exception {
			try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartDeleteSql);) {
				pstmt.setString(1, k);
				int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
				if (result == 0) {
					System.out.println(result); // 정상 처리되면 1, 안되면 0이 돌아옴
					throw new Exception("id 를 확인해주세요");

				}
			} catch (Exception e1) {
				throw e1;
			}
		}

/*------------------------------Update------------------------------*/
	@Override
	public void update(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartUpdateSql)) {
			pstmt.setInt(1, v.getCnt());
			pstmt.setString(2, v.getId());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("존재하지 않는 ID 입니다.");
			}
		} catch (SQLException e1) {
			throw e1;
		}
	
	}
/*------------------------------Select------------------------------*/

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
//		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectSql);) {
//			pstmt.setString(1, k);
//			try (ResultSet rset = pstmt.executeQuery()) {
//				rset.next();
//				String id = rset.getString("id");
//				String user_name = rset.getString("user_name");
//				String item_name = rset.getString("item_name");
//				int price = rset.getInt("price");
//				Date regdate = rset.getDate("regdate");
//				item = new Item(id, name, price, rate, regdate);
//			} catch (Exception e) {
//				throw e;
//			}
//		} catch (Exception e) {
//			throw e;
//		}
		
		return cart;
	}

/*------------------------------SelectAll------------------------------*/
	@Override
	public List<Cart> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

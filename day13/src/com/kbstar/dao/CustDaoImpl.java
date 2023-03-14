package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() {

/* Driver Loading --------------------------------------------------------- */
		// 이 객체가 생성이 되면 드라이버가 한번 올라온다
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Dirver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");
	}

	public Connection getConnection() throws Exception {
		Connection con = null;
		Properties props = new Properties();
		String fileName = "db_info.txt"; // day13 에 우클릭- new - File 해서 만듦
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}

	

	/*------------------------------Insert------------------------------*/
	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, 50);
			//int result = pstmt.executeUpdate();
		} catch (SQLException e1) {
			throw e1; // App 에서 확인할 수 있도록 해야하므로..
			//e1.printStackTrace();
		}
	}

	
	
	/*------------------------------Delete------------------------------*/
	@Override
	public void delete(String k) throws Exception {
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql); ) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate(); 
			System.out.println(result); 
			if(result == 0) {
				throw new Exception("존재하지 않는 ID 입니다.");
			}
			 
		} catch (SQLException e1) {
			throw e1;
		} 

	}

	
	/*------------------------------Update------------------------------*/
	@Override
	public void update(Cust v) throws Exception {
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.updateSql); ) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("없음");
			}
			
		} catch (SQLException e1) {
			throw e1;
		}

	}

	
	/*------------------------------Select------------------------------*/
	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql)) {
			pstmt.setString(1, k);
			
			try(ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age);
				
			} catch (Exception e) {
				// 목록에 없을 때 예외 발생 
				throw e;
			}	
			
		}catch(Exception e) {
			// 서버가 없을 때 예외 발생
			throw e;	
		}
		
		return cust;
	}
	
	
	/*------------------------------SelectAll------------------------------*/

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql)) {
			try(ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					Cust cust = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id, pwd, name, age);
					list.add(cust);
				}
				
			} catch(Exception e) {
				
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}
	
	/*------------------------------Search------------------------------*/

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

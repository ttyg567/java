package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {
		
		/* Driver Loading ---------------------------------------*/
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");
	
		/* Connect-----------------------------------------------*/
		String id = "bank";     
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.60:1521:XE";   //cmd 켜서 ipconfig 라고 치면 내 ip나옴 ipv4
		String deleteSql = "DELETE FROM cust WHERE id = ?";
		
		/* Statement 생성 - SQL-----------------------------------*/
		
		/* SQL 전송-----------------------------------------------*/
		
		// 리소스 자동해제 예외처리
		try(Connection con = DriverManager.getConnection(url, id, pwd); 
				PreparedStatement pstmt = con.prepareStatement(deleteSql); ) {
			pstmt.setString(1, "id7");
			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			System.out.println(result);  // 정상 처리되면 1, 안되면 0이 돌아옴
			// 없는 데이터를 지워도 exception 이 발생하는게 아니라 그냥 0이 반환됨
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
		
	
	}

}

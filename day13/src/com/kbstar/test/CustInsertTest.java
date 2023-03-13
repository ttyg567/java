package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = 
				new CustCRUDServiceImpl();
		
		
		/*------------------------------Register------------------------------*/
//		Cust cust = new Cust("id81", "pwd20", "tom", 30);
//		try {
//			crudService.register(cust);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		
	   /*------------------------------Remove------------------------------*/
//		try {
//			crudService.remove("id07");
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		

		/*------------------------------Modify------------------------------*/	
//		Cust cust = new Cust("id66", "3333", "tom", 40);
//		try {
//			crudService.modify(cust);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		
		

		/*------------------------------get------------------------------*/
		try {
			System.out.println(crudService.get("id66"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		

		/*------------------------------SelectAll------------------------------*/
		
		
		
		
		

	}

}

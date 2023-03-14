package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = 
				new CustCRUDServiceImpl();
		
		
		
		/*------------------------------Register------------------------------*/
		Cust cust = new Cust("id2", "pwd20", "tom", 30);
		try {
			crudService.register(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
		
//		Cust cust = null;
//		try {
//			cust = crudService.get("id66");
//			System.out.println(cust);
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		/*------------------------------get all------------------------------*/
		
//		List<Cust> list = null;
//		try {
//			list = crudService.get();
//			if(list.size() == 0) {
//				System.out.println("데이터가 없습니다.");
//			} else {
//				for(Cust obj: list) {
//				System.out.println(obj);
//				}
//			}
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
	}

}

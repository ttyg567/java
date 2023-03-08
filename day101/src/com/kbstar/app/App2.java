package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;


public class App2 {

	public static void main(String[] args) {
		
		DAO<Integer, ItemDTO> itemDao = new ItemDAO();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("Input command(q, i, d, u, s, sa)");
			String cmd = sc.next();
			
			/* -----------------quit ----------------------- */
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
				
			/* ----------------- insert ----------------------- */
			} else if(cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.insert(item);
				} catch (Exception e) {
					System.out.println("id가 존재합니다");
				}
			
			/* -----------------  delete ----------------------- */
			} else if(cmd.equals("d")) {
				
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				try {
					itemDao.delete(id);
				} catch (Exception e) {
					System.out.println("존재하지 않는 ID 입니다.");
				
				}
				
			/* -----------------  update ----------------------- */	
			} else if(cmd.equals("u")) {
				
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity...");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.update(item);
				} catch (Exception e){
					System.out.println("존재하지 않는 ID 입니다.");
				}
				
			/* -----------------  select ----------------------- */		
			} else if(cmd.equals("s")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				ItemDTO item = null;
				try {
					item = itemDao.select(id);
					System.out.println(item);
				} catch (Exception e) {
					System.out.println("존재하지 않는 ID 입니다.");
				}
				
			/* -----------------  select all ----------------------- */		
			} else if(cmd.equals("sa")) {
				List<ItemDTO> list = null;
				try {
					list = itemDao.select();
					for(ItemDTO u: list) {
						System.out.println(u);
					}
				} catch (Exception e) {
									
				}
				
			}
		}
		sc.close();
		

	}
}






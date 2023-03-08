package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;


public class App {

	public static void main(String[] args) {
		
		DAO<String, UserDTO> userDao = new UserDAO();
		
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
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					userDao.insert(user);
				} catch (Exception e) {
					System.out.println("id가 존재합니다");
				
				}
			
			/* -----------------  delete ----------------------- */
			} else if(cmd.equals("d")) {
				
				System.out.println("Input ID...");
				String id = sc.next();
				try {
					userDao.delete(id);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				
				}
				
			/* -----------------  update ----------------------- */	
			} else if(cmd.equals("u")) {
				
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					userDao.update(user);
				} catch (Exception e){
					System.out.println("id가 존재하지 않습니다.");
				}
				
			/* -----------------  select ----------------------- */		
			} else if(cmd.equals("s")) {
				System.out.println("Input ID...");
				String id = sc.next();
				UserDTO user = null;
				try {
					
					user = userDao.select(id);
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}
				
			/* -----------------  select all ----------------------- */		
			} else if(cmd.equals("sa")) {
				List<UserDTO> list = null;
				try {
					list = userDao.select();
					for(UserDTO u: list) {
						System.out.println(u);
					}
				} catch (Exception e) {
									
				}
				
			}
		}
		sc.close();
		

	}
}






package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;


public class App2 {

	public static void main(String[] args) {
		Service<Integer, ItemDTO> service = new ItemService();   
		SearchService search = new ItemService(); // ServiceSearch 인터페이스를 새로 생성한 경우
		//ItemService service = new ItemService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q, i, d, u, s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
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
				service.register(item);
							
			} else if(cmd.equals("d")) {
				
				// 예외사항 처리 예시
				System.out.println("Input ID...");
				try {
				int id = Integer.parseInt(sc.next());
				service.remove(id);
				} catch(Exception e) {
					System.out.println("잘못 입력 하셨습니다.");
				}
				
				
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
				service.modify(item);
				
				
				
			}else if (cmd.equals("s")) {
				// 인터페이스 안에 정의를 한 것이 아니면, 위에서
				// ItemService service = new ItemService(); -> 이렇게 불러와야만 쓸 수 있다
				// 인터페이스에 정의할 때, ItemService에만 정의할 때는 아래와 같이 불러옴
				// service.search();
				// ServiceSearch 인터페이스를 새로 만들었을 때는 아래와 같이 불러옴
				search.search();
			}
		}
		sc.close();
		

	}

}


//public class App {
//
//	public static void main(String[] args) {
////		Service<String, UserDTO> service;
////		service = new UserService();  //promotion
//		//  한줄로 작성
//		Service<String, UserDTO> service = new UserService();
//		UserDTO user = new UserDTO("id01", "pwd01", "james");
//		service.register(user);
//				
//
//	}



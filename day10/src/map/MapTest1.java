package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map.size());
		System.out.println(map.containsKey(6));  // false
		System.out.println(map.containsKey(5)); // true
		System.out.println(map.containsValue("D")); // true
		
		System.out.println(map.get(1)); // A
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys.toString());
		
		for(int data: keys) {
			System.out.println(map.get(data));
			
		}
	}

}

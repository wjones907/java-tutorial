package tutorial;

import java.util.HashMap;
import java.util.Map;


public class TestHashMap {

/*	Using for each to iterate through a HashMap
	This is the advised approach. It gives you full control over the keys and values in the map. With this approach you actually iterate through the EntrySet of the map and you get the key and value of each entry inside the loop.
*/
		public static void main(String[] args) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("key1", "value1");
			map.put("key2", "value2");

			for (Map.Entry<String, String> entry : map.entrySet()) {
			    System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	
	
	
	
}

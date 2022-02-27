package day21java;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Map<Numbers, String> map = new EnumMap<Numbers, String>(Numbers.class);

				//Assosiate values in map
				map.put(Numbers.ONE, "1");
				map.put(Numbers.TWO, "2");
				map.put(Numbers.THREE, "3");
				map.put(Numbers.FOUR, "4");
				map.put(Numbers.FIVE, "5");
				map.put(Numbers.SIX, "6");
				map.put(Numbers.SEVEN, "7");
				map.put(Numbers.EIGHT, "8");
				map.put(Numbers.NINE, "9");
				map.put(Numbers.TEN, "10");
				map.put(Numbers.TEN, "10");
				map.put(Numbers.TEN, "10");
				map.remove(Numbers.TWO, "2");
		        map.replace(Numbers.FOUR, "4", "2");

		        Set<Entry<Numbers, String>> entrySet = map.entrySet();
				for (Entry<Numbers, String> entry : entrySet) {
					System.out.println(entry.getKey()+"\t"+entry.getValue());
				}
			}

		}


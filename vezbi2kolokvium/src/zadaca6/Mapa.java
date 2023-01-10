package zadaca6;

import java.util.Map;
import java.util.HashMap;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer,String> mapa1 = new HashMap<Integer,String>();
		
		mapa1.put(1, "Ronaldo");
		mapa1.put(2, "Messi");
		mapa1.put(3, "Ibrahimovic");
		
		System.out.println(mapa1.keySet());
		System.out.println(mapa1.values());
		System.out.println(mapa1.size());
		
		for(Map.Entry<Integer, String> entry : mapa1.entrySet() ) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

	}

}

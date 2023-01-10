package zadaca5;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Zdravo");
		set1.add("Gabriel");
		set1.add("Batistuta");
		
		System.out.println(set1);
		System.out.println(set1.size());

	}

}

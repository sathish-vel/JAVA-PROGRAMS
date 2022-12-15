package labSession;

import java.util.*;

public class ProbelmThree {
	String str = new String("Delhi");
	String str1 = new String("Japan");

	public void retrieveCapital(HashMap<String, String> mapString) {
		for (Map.Entry m : mapString.entrySet()) {
			if (m.getValue().equals(str)) {
				System.out.println("The Captial of Delhi is : " + m.getKey());
				break;
			} else
				System.out.println("NULL");
		}
	}

	public void retrieveCountry(HashMap<String, String> mapString) {
		for (Map.Entry m : mapString.entrySet()) {
			if (m.getKey().equals(str1)) {
				System.out.println("The Country of Japan is : " + m.getValue());
				break;
			} else
				System.out.println("NULL");
		}
	}

	public static void main(String[] args) {
		ProbelmThree obj = new ProbelmThree();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");

		obj.retrieveCapital(map);
		obj.retrieveCountry(map);

	}
}

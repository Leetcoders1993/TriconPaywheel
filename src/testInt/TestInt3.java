package testInt;

import java.util.HashMap;
import java.util.Map;

public class TestInt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "abcdABCDabcd";
		
		
		Map<Character ,Integer> hm = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<str.length();i++) {
			
			if(hm.containsKey(str.charAt(i))) {
				
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
				
				
			}
			
			else {
				
				hm.put(str.charAt(i), 1);
				
			}
		}

		
		System.out.println(hm);
		
	}

}

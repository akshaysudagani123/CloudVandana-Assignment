import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romanToInteger {
    
	public static void main(String[] args) {
		
		
		System.out.println("Enter the roman number");
		Scanner scan = new  Scanner(System.in);
		String str = scan.next();
		int result = convertRomanToInteger(str);
		System.out.println("Integer Equivalent number is:"+result);
		
	}
	public static int convertRomanToInteger(String str) {
	       
	       
		Map<Character,Integer> charMap = new HashMap();
		charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);
        
        int result =0;
      
        /*
        Traverse a string and pick each character at a time.
      */
        for(int i=0;i<str.length()-1;i++) {
        	
        	 /*
            If current Roman numeral value is greater than
            then the next value, the do addition.
          */
        	
        	if(charMap.get(str.charAt(i))>= charMap.get(str.charAt(i+1))) {
        		
        		result = result + charMap.get(str.charAt(i));
        	}
        	else {
        		result = result-charMap.get(str.charAt(i));
        	}
        	
        	result = result + charMap.get(str.charAt(str.length()-1));
        	
        	
        	
        }
		return result;
        
	}
}

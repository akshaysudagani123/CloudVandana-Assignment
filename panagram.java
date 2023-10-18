import java.util.Scanner;

public class Panagram {

	    public static void main(String[] args) {
	    	
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        
	        String input = scan.next().toLowerCase(); 
	        
	        // Convert to lowercase for case-insensitivity

	        if (isPangram(input)) {
	            System.out.println("The input is a pangram.");
	        } 
	        
	        else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	    	
	        for (char letter = 'a'; letter <= 'z'; letter++) {
	        	
	            if (input.indexOf(letter) == -1) {
	            	
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}

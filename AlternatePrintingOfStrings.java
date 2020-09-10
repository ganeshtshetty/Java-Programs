import java.util.Scanner;

public class AlternatePrintingOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			System.out.println("Enter string 1");
			String s1 = s.nextLine();
			System.out.println("Enter string 2");
			String s2 = s.nextLine();
		    StringBuilder result = new StringBuilder(); 
	  
	        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
	  
	            if (i < s1.length()) 
	                result.append(s1.charAt(i)); 
	            if (i < s2.length()) 
	                result.append(s2.charAt(i)); 
	        }
	        System.out.println(result);
	}

}

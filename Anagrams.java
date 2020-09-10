import java.util.*;
public class Anagrams {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			System.out.println("Enter String 1");
			String s1 = s.nextLine();
			System.out.println("Enter String 2");
			String s2 = s.nextLine();
			boolean status = true;  
	        if (s1.length() != s2.length()) 
	        {  
	            status = false;  
	        }
	        else
	        {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) 
	        {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else 
	        {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	}

}

import java.util.Arrays;
import java.util.Scanner;
public class CommonUncommonWithCases
{
    static String result;
    static int MAX_CHAR = 26;
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s = new Scanner(System.in);
		String str1 = "wipro"; 
        String str2 = "technology"; 
        int input3 = s.nextInt();
        int input4 = s.nextInt();
        explore(str1, str2, input3, input4);
        //findAndPrintUncommonChars(str1, str2); 
	}
	public static void explore(String str1, String str2, int input3, int input4)
	{
	    if(input3 == 0)
	    {
	        result = findAndPrintUncommonChars(str1, str2);
	    }
	    else
	    {
	        result = findAndPrintcommonChars(str1, str2);
	    }
	    if(input4 == 0)
	    {
	        result = result.toUpperCase();
	    }
	    else
	    {
	    	result = result.toLowerCase();
	    }
	    System.out.println(result);
	}
	public static String findAndPrintUncommonChars(String str1, String str2) {
		int present[] = new int[MAX_CHAR]; 
		String uncommon = "";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
        for (int i = 0; i < MAX_CHAR; i++)  
        { 
            present[i] = 0; 
        } 
  
        int l1 = str1.length(); 
        int l2 = str2.length(); 
  
        // for each character of str1, mark its 
        // presence as 1 in 'present[]' 
        for (int i = 0; i < l1; i++) 
        { 
            present[str1.charAt(i) - 'a'] = 1; 
        } 
  
        // for each character of str2 
        for (int i = 0; i < l2; i++) 
        { 
              
            // if a character of str2 is also present 
            // in str1, then mark its presence as -1 
            if (present[str2.charAt(i) - 'a'] == 1
                || present[str2.charAt(i) - 'a'] == -1)  
            { 
                present[str2.charAt(i) - 'a'] = -1; 
            }  
              
            // else mark its presence as 2 
            else
            { 
                present[str2.charAt(i) - 'a'] = 2; 
            } 
        } 
  
        // print all the uncommon characters 
        for (int i = 0; i < MAX_CHAR; i++) 
        { 
            if (present[i] == 1 || present[i] == 2)  
            { 
                //System.out.print((char) (i + 'a') + " ");
            	uncommon += (char)(i+'a'); 
            	
            } 
        } 
		return uncommon;
	}
	public static String findAndPrintcommonChars(String str1, String str2) {
		 // To store the frequencies of characters 
	    // of string s1 and s2 
		String common = "";
		int n1 = str1.length();
		int n2 = str2.length();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
	    int []freq1 = new int[26]; 
	    //int []freq2 = new int[26]; 
	    Arrays.fill(freq1, 0); 
	    //Arrays.fill(freq2, 0); 
	  
	    // To store the count of valid pairs 
	    int i, count = 0; 
	  
	    // Update the frequencies of 
	    // the characters of string s1 
	    for (i = 0; i < n1; i++) 
	        freq1[str1.charAt(i) - 'a']++; 
	  
	    // Update the frequencies of 
	    // the characters of string s2 
	    for (i = 0; i < n2; i++) 
	        freq1[str2.charAt(i) - 'a']++; 
	  
	    // Find the count of valid pairs 
	    /*for (i = 0; i < 26; i++) 
	        count += (Math.min(freq1[i], freq2[i])); 
	  	*/
	    for(i=0;i<MAX_CHAR;i++)
	    {
	    	if(freq1[i] > 0)
	    		common += (char)(i+'a');
	    }
	    
	     
	     
		return common;
	}
}

import java.util.Scanner;
public class ReturnHalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		int len = str.length();
		//System.out.println("String length = "+len);
		if(len%2 == 0)
		{
		    String sub = str.substring(0,len/2);
		    System.out.println(sub);
		}
		else
		    System.out.println("NULL");
	}

}

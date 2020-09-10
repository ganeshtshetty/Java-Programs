import java.util.Scanner;
public class StriingConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String1");
		String str1 = s.nextLine();
		System.out.println("Enter String2");
		String str2 = s.nextLine();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(ch1[ch1.length - 1] ==  ch2[0])
		{
			String temp = str2.substring(1);
			System.out.println(str1+""+temp);
		}
		else
			
			System.out.println(str1.concat(str2));
	}

}

import java.util.*;

public class UserIdGeneration {
	public String userIdGeneration(String input1,String input2,int input3,int input4){
		// Read only region end
		// Write code here...
						int len1=input1.length();
				int len2=input2.length();
					String sname=input2;
					String lname=input1;
				String inp3=Integer.toString(input3);
				if(len1>len2)
				{
					sname=input2;
					lname=input1;
				}
				else if(len1<len2)
				{
					sname=input1;
					lname=input2;
				}
				else
				{ 
					if(input1.compareTo(input2) > 1)
					{
						sname=input2;
						lname=input1;
					}
						 
					else if(input1.compareTo(input2) < -1)
					{
						sname=input1;
						lname=input2;
					}
					 
				}
				String uid = sname.charAt(sname.length() - 1) + lname + inp3.charAt(input4 - 1) + inp3.charAt(inp3.length() - input4);
				
				char[] str = uid.toCharArray();
				for (int i=0; i<str.length; i++) 
			    { 
			        if (str[i]>='A' && str[i]<='Z') 
			            str[i] = (char) (str[i] + 'a' - 'A'); 
			        else if (str[i]>='a' && str[i]<='z') 
			            str[i] = (char) (str[i] + 'A' - 'a'); 
			    } 
				
				String result = "";
				for(int i=0;i<str.length;i++)
				{
					result += str[i];
				}
				return result;
				
	}
}

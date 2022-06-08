package string;

import java.util.Arrays;

public class Rposition {

	public static void main(String[] args) {
		String a = "my name is ram i am from shirur";
		System.out.println(a);
		
		String [] b = a.split(" ");
		
		System.out.println(Arrays.toString(b));
		
		String  RevString = ""; 
	
		for(int i = 0; i<b.length; i++)
		{
			String c = b[i];
			
			String  RevW = "";
			for(int j = (c.length()-1); j>=0; j--)
			{
				RevW = RevW + c.charAt(j);
			
			
			}
			RevString = RevString + RevW + " " ;
			
			
		}
		System.out.println(RevString);
		//String [] d = RevString.split(" ");
		//System.out.println(Arrays.toString(d));
		
	}

}

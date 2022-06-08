package string;

public class DuplicateS {

	public static void main(String[] args) {
		String [] a = {"ram", "sham", "ram", "ark", "komal", "vishal", "ark"};
		
		System.out.println("Dublicate String = ");
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}

package star;

public class StarPattern2 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++)
		{
			for(int a = i; a<5; a++)
			{
				System.out.print(" ");
			}
			for(int b = i; b>=1; b--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}

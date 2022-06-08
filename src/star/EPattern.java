package star;

public class EPattern {

	public static void main(String[] args) {
		for(int i = 0; i<7; i++)
		{
			if(i==0||i%3==0)
			{
				m1();
			}
			else
			{
				
				m2();
				
			}
			
		}
		
	}
	
     public static void m2()
     {
    	 System.out.println("*");
     }
     public static void m1()
 	{
 		System.out.println("* * * *");
 	}

}
//*
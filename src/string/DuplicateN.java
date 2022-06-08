package string;

public class DuplicateN {

	public static void main(String[] args) {
		int [] a = {1,3,5,8,2,3,5};
		System.out.println("Duplicate Number = ");
		
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

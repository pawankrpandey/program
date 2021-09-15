package SDETprogramspractice;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7;
		int count=0;
		
		if(a>1)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime");
			}
		}
		else
		{
			System.out.println("number is not prime");
		}
		
		
		
		
		
		
		
	}

}

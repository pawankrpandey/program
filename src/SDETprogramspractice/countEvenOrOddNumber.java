package SDETprogramspractice;

public class countEvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=123576;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			
			if(num%2==0)
			{
				even++;	
			}
			else
			{
				odd++;
			}
			num=num/10;
			
		}
		System.out.println(even +" is even number");
		System.out.println(odd +" is odd number");
			
		
		
		
		
	}

}

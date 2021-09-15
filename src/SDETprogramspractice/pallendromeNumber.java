package SDETprogramspractice;

public class pallendromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=16561;
		int rev=0;
		int b=a;
		while(a>0)
		{
			rev=rev*10 + a%10;  //4, 43,  432, 4321(use a=1234) 
			a=a/10;	
			
		}
		System.out.println(rev);
		
		if(b==rev)
		{
			System.out.println(b+"  pallendrome number");
		}
		else
		{
			System.out.println(b+" Not pallendrome number");
		}
		
	
	}

}

package SDETprogramspractice;

public class findLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20,c=30;
		
		
//		while(a>b && a>c) 
//		{
//			
//				System.out.println("a is largest  number:"+a);
//			
//		}
//	
//		while(b>a && b>c) 
//		{
//			
//				System.out.println("b is largest  number:"+b);
//			
//		}
//		
//		while(c>a && c>b) 
//		{
//			
//				System.out.println("c is largest  number:"+c);
//			break;
//		}
		
		//by using if else conditions
		
//		if(a>b && a>c)
//		{
//			System.out.println("a is largest  number:"+a);
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("b is largest  number:"+b);
//		}
//		else
//		{
//			System.out.println("c is largest  number:"+c);
//		}
		
		//Ternary operator
		
	    int largest= a>b?a:b;
	    largest=c>largest?c:largest;
		
		System.out.println(largest +":is lagest number");
	}

}

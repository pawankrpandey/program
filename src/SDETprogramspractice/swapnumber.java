package SDETprogramspractice;

public class swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10 ,  b=20;
		
		System.out.println("Before swapping number...." +a+"  "+b);
		
	//Using third variable	
		int c;
		
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("After swapping number using third variable"+" "+ a+"  "+b);
		
	//without using third variable
		
//		a=a+b;   //10+20 =30
//		b=a-b;   //30-20 =10
//		a=a-b;  //30-10 =20
//		
//		System.out.println("After swapping number without using third variable"+" "+ a+"  "+b);
		
	//without using third variable but not Zero
		
//		a=a*b; //10*20 =200
//		b=a/b; //200/20 =10
//		a=a/b; //200/10 =20
//		
//		System.out.println("After swapping number without using third variable"+" "+ a+"  "+b);
		
	//Using Bitwise Operator XOR(^)
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		
//		System.out.println("After swapping number using Bitwise operator"+" "+ a+"  "+b);
		
	//Using single statement
		
		b=a+b-(a=b);
		
		System.out.println("After swapping number without using third variable"+" "+ a+"  "+b);
	}

}

package Hareprograms;

public class Swapinteger {

	public static void main(SImutiable[] args) {
		// TODO Auto-generated method stub
		



		

	

		int a = 10, b = 20;
		System.out.println("before swapping numbers: " + a + "  " + b);

		
		 // logic 1 using third variable
		 
		/*      int t = a;//t=10
		          a = b;//a=20
		          b = t;//b=10
		*/

		// logic 2

	/*	
		  a=a+b;//a=30
		  b=a-b; //b=10
		  a=a-b; //a=20
	*/	


		//logic 3


	/*	a=a*b;//a=200
		b=a/b;//b=10
		a=a/b;//a=20
		*/

		
		a=a^b;
		b=a^b;
		a=a^b;


		System.out.println("after swapping numbers: " + a + "  " + b);
		//System.out.println(a);
		//System.out.println(b);



		}

		

	}



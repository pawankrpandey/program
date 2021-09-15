package Hareprograms;

public class ReverceStringBuffer {

	public static void main(SImutiable[] args) {
		// TODO Auto-generated method stub

		//int num=12345;
		String num="pawan";

		/* // Scanner sc = new Scanner(System.in); 
		// System.out.println("enter a number");

		// int num=sc.nextInt();

		//using algorithm
		int rev=0;

		while(num!=0)
		{
		rev=rev*10 + num%10;
		num=num/10;

		}                                      */

		/* //using stringbuffer   2nd method
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();         */


		//using stringbuilder   3rd method
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev1=sb1.reverse();


		System.out.println("reverse number is"+rev1);


		
	}

}

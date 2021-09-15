package Hareprograms;

public class AdditionofNumber {

	public static void main(SImutiable[] args) {
		// TODO Auto-generated method stub

		 int num=12345;
		 int sum=0;

		 while(num>0) {
		 sum=sum+num%10;  //5+4+3+2+1
		 num=num/10;      //1234  123  12  1 
		 }
		 System.out.println("sum of the digit: "+sum);

		
		
	}

}

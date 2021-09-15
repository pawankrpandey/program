package programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7,c=0,	first=0,second=1;
	
		for(int i=0;i<a;i++) {
			System.out.println(first);//0 1 1 2
			 c=first+second;//1 2 3
			first=second;//1 1 2
			second=c;//1 2 3
			
		}
		
	}

}

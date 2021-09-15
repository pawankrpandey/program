package programs;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234,rev=0,r;
		
		while(a>0) {
			r=a%10;//4
			rev=rev*10+r;//4
			a=a/10;//123
		}
		System.out.println(rev);
		
		
	}

}

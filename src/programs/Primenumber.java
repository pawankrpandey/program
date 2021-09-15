package programs;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int a=23;
		int i;	
			System.out.println("enter any number");
			
			for( i=2;i<a;i++) {
				if(a%i==0) {
				System.out.println("not primr");
				break;
				}
			
			}
		if(i==a) {
			System.out.println("prime");
		}
			
		}

	

}

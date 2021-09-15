package Hareprograms;

public class StarParrten {

	public static void main(String[] args) {
		//1st method
				for(int i=0; i<=4;i++) {
					for(int j=0; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}      
//		
//		*
//		**
//		***
//		****
//		*****
//		*****
//		****
//		***
//		**
//		*
				//2nd method 
				for(int i=0; i<=4;i++) {
					for(int j=4; j>i; j--) {
						System.out.print("*");
					}
					System.out.println();
				
				}    

	}

}

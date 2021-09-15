package SDETprogramspractice;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
		
        //using algorithm
        
//        int rev=0;
//        
//        while(num!=0)
//        {
//        	rev=rev*10 + num%10;
//        	num=num/10;
//        }
//		System.out.println(rev);
	
		//using String buffer class
        
      /*  StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println(rev);*/
        
        
        //using StringBuilder class
        
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);
		
	}

}

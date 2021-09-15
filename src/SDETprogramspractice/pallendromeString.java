package SDETprogramspractice;

import java.util.Scanner;

public class pallendromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);
//		String a=sc.next();
		
		String a="madam";
		//String b=a;
		
		String b=a;
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
	
	  if(b.equals(rev))
	  {
		  System.out.println(b +"  pallendrome String");
	  }
	  else
	  {
		  System.out.println(b +"  Not pallendrome String");
	  }
	
	
	
	}

}

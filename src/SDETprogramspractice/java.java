package SDETprogramspractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class java {

	
	public static void main(String[] args) {
		
		
		//For Integer
//		int a[]= {1,2,3,4,5,6};
//		
//			
//			System.out.println("Length of Integer........."+a.length);
//	
//		for(int j=1;j<=a.length;j++)
//		{
//			System.out.println(j);
//		}
//		
//	System.out.println(".............Reverse Number...................");
//		
//        for(int i=a.length;i>0;i--)
//        {		
//        		System.out.println(i);
//        }
		
		
	//For String
        
    //	String b = "pawan";
//		
//    
//		System.out.println(b.intern());
//		System.out.println(b.charAt(0));
//		System.out.println("Length of String........."+b.length());
//		
//		for(int i=0;i<b.length();i++)
//		{
//			if( i<b.length())
//			{
//			
//			char c=b.charAt(i);
//			
//				System.out.println(c);
//			}
//		//	System.out.println(i);
//		}
//	
//	System.out.println(".............Reverse Number..................."+b.length());
//		
//        for(int j=b.length();j>=0;j--)
//        {		
//        		if(j<b.length())
//        		{
//        			char z=b.charAt(j);
//        					System.out.print(z);
//        		}
//        }
		
		
        
        
//    String    c="pawan";
//        int z=0;
//        int x =c.length()-1;
//      System.out.println(x);
//     while( z<c.length())
//        {
//       System.out.println(c.charAt(z));
//        z++;
//        }
//        System.out.println(".............reverse..........");
//      while(x<c.length())
//      {
//    	 
//    	  System.out.println(c.charAt(x));
//    	if(x==0) {
//    		break;
//    	}
//    	  x--;
//    	 
//    	
//      }
        
//		String a = "AARAV";  
//		int b=a.length();
//		int c=a.replace("A","").length();
//        int d= b-c;
//        System.out.println(d);
//		for(int i=0;i<a.length();i++) {
//			String v=a.replaceFirst("A", "a");
//			
//			System.out.println(v);
//			
//		}
        //reverse String program
        
		String a="java automation testing";
    	String rev="";
    	String[] b=a.split(" ");
    	System.out.println(b.length);
       for(int i=b.length-1;i>=0;i--) {
    	   rev=rev+b[i]+" ";
       }
       System.out.println(rev);
    
	}

}

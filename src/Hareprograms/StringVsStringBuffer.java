package Hareprograms;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String();
		s="durga";
		s.concat("software");
		System.out.println(s);

		StringBuffer b=new StringBuffer("durga");
		//b="durga";
		b.append("software");
		System.out.println(b);

		
		
	}

}

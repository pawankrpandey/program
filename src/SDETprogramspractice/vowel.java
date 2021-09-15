package SDETprogramspractice;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="PAWAN KUMAR";
		int vowel=0;
		int consonent=0;
	//	System.out.println(a.charAt(0));
		for(int i=0;i<a.length();i++){
			
			char c=a.charAt(i);
			
		if(c!=' ') {	
		
		if( c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("It is vowel"+" "+c);
			vowel++;
		}
		else{
			System.out.println("It is not vowel"+" "+c);
			consonent++;
		}
		}
		}
		System.out.println("Number of vowel:-"+" "+vowel);
		System.out.println("Number of consonent:-"+" "+consonent);
	}

}

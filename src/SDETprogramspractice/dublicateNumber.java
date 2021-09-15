package SDETprogramspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class dublicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]= {1,2,3,4,4,3,2,1,5};
//
//		boolean Flag=false;
//		for(int i=0;i<arr.length;i++)
//		{
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				System.out.println("found duplicate"+" "+arr[i]);
//				Flag=true;
//			}		
//		}
//
//		}
//		if(Flag==false) {
//			System.out.println("Duplicate Element Not Found");
//		}
		
		
	/*String arr[]= {"java","c#","java"};
	HashSet<String> hs=new HashSet<String>();
	boolean flag=false;
	for(String l:arr) {
		if(hs.add(l)==false) {
			System.out.println("found duplicates"+" "+l);
			flag=true;
		}
		if(flag==false) {
			System.out.println("not found duplicates");
		}
	}*/
		String a="pawankumar";
	int	tcount=a.length();
	int	trcount=a.replace("a", "").length();
		int count=tcount-trcount;
		System.out.println(count);
	}

}

package programs;
import java.util.Comparator;
import java.util.TreeSet;
public class Compratordemo {

	

		

		

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t= new TreeSet(new MyComparator());
		t.add("hari");
		t.add("champ");
		t.add("hello");
		t.add("pavan");
		System.out.println(t);

		}

		}
		        class MyComparator implements Comparator{
		        public int compare(Object obj1,Object obj2) {
		        String s1=obj1.toString();
		        //String s2=obj2.toString();
		        String s2=(String)obj2;
		       return -s1.compareTo(s2);
		       // return-1;
		        }
		        

	}



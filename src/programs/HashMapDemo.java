package programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	


		

		public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	HashMap<String,Integer> m=new HashMap<String,Integer>();
			HashMap m= new HashMap();
		m.put("hari", 700);
		m.put("sam", 800);
		m.put("champ", 100);
		m.put("pavan", 400);
		//m.put(null, 500);
		//m.put(null, 500);
		System.out.println(m.get("sam"));
	//	Set s2=m.entrySet();
	//	System.out.println(s2);
		System.out.println(m);//to print all values
		System.out.println(m.put("hari", 1000));
		System.out.println(m);
		Set s =m.keySet();
		System.out.println(s);//to print all keys
		Collection c = m.values();
		System.out.println(c);//to print all values
		Set s1=m.entrySet();
		System.out.println(s1);//to print all new set values
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey());
		System.out.println(m1.getValue());
		if(m1.getKey().equals("pavan")) {
		m1.setValue(2000);
		}
		}
		System.out.println(m);
		}


		}

	



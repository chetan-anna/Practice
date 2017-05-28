package CollectionDemo;

import java.util.ArrayList;

public class Arraylist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(10);
al.add("ratan");
al.add(10.5);
System.out.println(al);
System.out.println(al.size());
al.add(1, "anu");
System.out.println(al);
System.out.println(al.size());
al.remove(0);
al.remove("ratan");
System.out.println(al);
System.out.println(al.contains("durga"));
System.out.println(al.isEmpty());
al.clear();
System.out.println(al.isEmpty());


	}

}

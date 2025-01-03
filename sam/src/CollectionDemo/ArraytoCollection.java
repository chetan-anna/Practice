package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArraytoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1[]={"ratan","shravya","aruna"};
ArrayList<String>al=new ArrayList<>(Arrays.asList(s1));
al.add("s4");
for (String string : al) {
	System.out.println(string);
}
LinkedList<String>ll=new LinkedList<>(Arrays.asList(s1));
for (String string : ll) {
	System.out.println(string);
// conflict code on master branch
}
	}

}

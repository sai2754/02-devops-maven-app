package maccess;
import java.util.*;
public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(new Integer(12));
		al.add(new Integer(11));
		al.add(new Integer(18));
		al.add(new Integer(14));
		System.out.println(al.toString());
		al.add(2,new Integer(500));
		System.out.println(al.toString());
		al.remove(2);
		System.out.println(al.toString());
		al.remove(new Integer(11));
		System.out.println(al.toString());
		al.set(2,new Integer(700));
		System.out.println(al.toString());
		Integer ele=al.get(2);
		System.out.println("Element at index:2 is"+ele);
		int len=al.size();
		System.out.println("Size of ArrayList" +len);
		System.out.println("Display ArrayList<E> reverse");
		for(int i=len-1; i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
	}

}

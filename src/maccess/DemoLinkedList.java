package maccess;
import java.util.*;
public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll =new LinkedList<Integer>();
		ll.add(new Integer(12));
		ll.add(new Integer(11));
		ll.add(new Integer(18));
		ll.add(new Integer(14));
		System.out.println(ll.toString());
		ll.add(2,new Integer(500));
		System.out.println(ll.toString());
		ll.remove(2);
		System.out.println(ll.toString());
		ll.remove(new Integer(11));
		System.out.println(ll.toString());
		ll.set(2,new Integer(700));
		System.out.println(ll.toString());
		Integer ele=ll.get(2);
		System.out.println("Element at index:2 is"+ele);
		int len=ll.size();
		System.out.println("Size of ArrayList" +len);
		System.out.println("Display ArrayList<E> reverse");
		for(int i=len-1; i>=0;i--)
		{
			System.out.print(ll.get(i)+" ");
		}
	}

}



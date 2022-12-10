package maccess;
import java.util.*;
public class DemoQueue {
	public static void main(String[] args) {
		System.out.println("===Priority queue<E>====");
		PriorityQueue<Integer> pq=new PriorityQueue();
		pq.add(new Integer(102));
		pq.add(new Integer(121));
		pq.add(new Integer(111));
		pq.add(new Integer(202));
		System.out.println(pq.toString());
		System.out.println("==Array dqueue<E>====");
		ArrayDeque<Integer> ad=new ArrayDeque();
		ad.add(new Integer(132));
		ad.add(new Integer(12));
		ad.add(new Integer(21));
		ad.add(new Integer(200));
		System.out.println(ad.toString());
		ad.addFirst(new Integer(51));
		ad.addLast(28);
		System.out.println(ad.toString());
		ad.removeFirst();
		ad.removeLast();
		System.out.println(ad.toString());
		System.out.println("===Linked List<E>====");
		LinkedList<Integer> ll= new LinkedList();
		ll.add(new Integer(12));
	    ll.add(new Integer(127));
		ll.add(new Integer(61));
	    ll.add(new Integer(20));
	    System.out.println(ll.toString());
		ll.addFirst(new Integer(94));
		ll.addLast(53);
		System.out.println(ll.toString());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll.toString());
	
	}
}

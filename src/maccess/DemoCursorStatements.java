package maccess;
import java.util.*;
public class DemoCursorStatements {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(new Integer(12));
		v.add(new Integer(11));
		v.add(new Integer(10));
		v.add(new Integer(16));
		System.out.println("==to String method===");
		System.out.println(v.toString());
		System.out.println("===Iterator<E>");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n===New Iterator<E>===");
		Iterator<Integer> it2=v.iterator();
		it2.forEachRemaining((k)->
		{
		System.out.print(k.toString()+" ");	
		});
		System.out.print("\n===listIterator<E>===");
		ListIterator<Integer> li=v.listIterator();
		System.out.println("\n===forward===");
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\n===backward===");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("\n===Enumeration<E>===");
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\n===Spliterator<E>===");
		Spliterator<Integer> sp=v.spliterator();
		sp.forEachRemaining((z)->
		{
		System.out.print(z.toString()+" ");	
		});
		Integer a[]= {12,11,10,45,67};
		System.out.println("\n===Spliterator<E> on Array===");
		Spliterator<Integer> sp2=Arrays.spliterator(a);
		sp2.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});

	}

}

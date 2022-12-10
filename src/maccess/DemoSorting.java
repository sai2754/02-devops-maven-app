package maccess;
import java.util.*;
public class DemoSorting {
	public static void main(String[] args) {
	System.out.println("***Array Object***");
	Integer a[]= {17,10,9,11,12,8};
	Arrays.sort(a);
	System.out.println("Ascending Order");
	for(Integer k:a)
	{
		System.out.print(k.toString()+" ");
	}
	System.out.println("\nDescending Order");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i].toString()+" ");
	}
	System.out.println("\n***List<E> objects***");
	ArrayList<Integer> al =new ArrayList<Integer>();
	al.add(new Integer(13));
	al.add(new Integer(11));
	al.add(new Integer(14));
	al.add(new Integer(10));
	al.add(new Integer(18));
	Collections.sort(al);
	System.out.println("Ascending Order");
	al.forEach((k)->
	{
		System.out.print(k.toString()+" ");
	});
	
	System.out.println("\nDescending Order");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i].toString()+" ");
	}
	}

}

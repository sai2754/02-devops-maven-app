package maccess;
import java.util.*;
public class DemoVector {
	public static void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>();
		System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		v.addElement(new Integer(11));
		v.addElement(new Integer(13));
		v.addElement(new Integer(10));
		v.addElement(new Integer(9));
		v.addElement(new Integer(17));
		v.addElement(new Integer(13));
		v.addElement(new Integer(16));
		v.addElement(new Integer(15));
		v.addElement(new Integer(19));
		System.out.println(v.toString());
		System.out.println(v.elementAt(4));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.setElementAt(new Integer(23), 2);
		System.out.println(v.toString());
		v.removeElementAt(2);
		System.out.println(v.toString());
		v.remove(2);
		v.addElement(new Integer(46));
		v.addElement(new Integer(93));
		v.addElement(new Integer(54));
		v.addElement(new Integer(10));
		v.addElement(new Integer(76));
		v.addElement(new Integer(17));
	    System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
	    
	
		
	}

}

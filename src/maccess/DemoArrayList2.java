package maccess;
import java.util.*;
public class DemoArrayList2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try 
			{
			ArrayList<Integer> al=new ArrayList<Integer>();
			System.out.println("Enter the no.of ele to add:");
			int n=s.nextInt();
			System.out.println("Enter the "+n+" elements:");
			for(int i=0; i<n; i++)
			{
				al.add(new Integer(s.nextInt()));
			}
			System.out.println(al.toString());
			System.out.println("Enter the element to be searched:");
			Integer ele=new Integer(s.nextInt());
			boolean k=al.contains(ele);
			if(k){
				int p=al.indexOf(ele);
				System.out.println("Element "+ele+" at index:"+p);
			}
			else
			{
				System.out.println("Element not available");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

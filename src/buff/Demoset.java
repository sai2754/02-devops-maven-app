package buff;
import java.util.*;;
public class Demoset {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Set<Integer> st=null;
		System.out.println("Enter choice:\n 1.Hashset \n 2.LinkedHashset\n 3.TreeSet");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			st=new HashSet<Integer>();
			break;
		case 2:
			st=new LinkedHashSet<Integer>();
			break;
		case 3:
			st=new TreeSet<Integer>();
		}
		st.add(20);
		st.add(30);
		st.add(45);
		st.add(35);
		st.add(10);
		System.out.println("====toString() Method====");
		System.out.println(st.toString());
		System.out.println("<Iterator> Method");
		Iterator<Integer> it=st.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n====Spliterator method====");
		Spliterator<Integer> spt=st.spliterator();
		spt.forEachRemaining((k)->{
			System.out.print(k.toString()+" ");
		});
		System.out.println("\n===forEach()===");
		st.forEach((z)->
		{ 
			System.out.print(z.toString()+" ");
		});
			
		}
}

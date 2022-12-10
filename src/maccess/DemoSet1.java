package maccess;
import java.util.*;
public class DemoSet1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Set<Integer> st=null;
				System.out.println("===Enter the choice===");
				System.out.println("1.Hashset<E>\n2.LinkedHashset\n3.Treeset");
				System.out.println("Enter the choice");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1:
					st=new HashSet<Integer>();
					break;
        		  case 2:
        			  st = new LinkedHashSet<Integer>();
        			  break;
        		  case 3:
        			  st = new TreeSet<Integer>();
        			  break;
        		  default:
							System.out.println("Invalid choice");
							System.exit(0);	
				}
				st.add(new Integer(10));
				st.add(new Integer(9));
				st.add(new Integer(101));
				st.add(new Integer(11));
				st.add(new Integer(10));
				System.out.println("====toString()=====");
				System.out.println(st.toString());
				System.out.println("====Iterator<E>=====");
				Iterator<Integer> it=st.iterator();
				while(it.hasNext())
				{
				System.out.println(it.next());
				}
				System.out.println("====spliterator<T>====");
				Spliterator<Integer> sp=st.spliterator();
				sp.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
				System.out.println("===forEach()====");
				st.forEach((z)->
				{
					System.out.println(z.toString());
				});
			     }
			catch(Exception e)
			{
				e.printStackTrace();
			}
			     
		}

	}

}

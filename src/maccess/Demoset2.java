package maccess;
import java.util.*;
import test.Product;
public class Demoset2 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			try(s;){
				try {
					Set<Product> st=null;
					System.out.println("===Enter the choice===");
					System.out.println("1.Hashset<E>\n2.LinkedHashset\n3.Treeset");
					System.out.println("Enter the choice");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						st=new HashSet<Product>();
						break;
	        		  case 2:
	        			  st = new LinkedHashSet<Product>();
	        			  break;
	        		  case 3:
	        			  st = new TreeSet<Product>();
	        			  break;
	        		  default:
								System.out.println("Invalid choice");
								System.exit(0);	
					}
					st.add(new Product("A134","MOU",123.34f,12));
					st.add(new Product("A101","ABC",145.37f,19));
					st.add(new Product("A100","KEY",153.34f,9));
					st.add(new Product("A199","REC",123.34f,2));
					st.add(new Product("A123","TAP",523.39f,12));
					System.out.println("====toString()=====");
					System.out.println(st.toString());
					System.out.println("====Iterator<E>=====");
					Iterator<Product> it=st.iterator();
					while(it.hasNext())
					{
					System.out.println(it.next());
					}
					System.out.println("====spliterator<T>====");
					Spliterator<Product> sp=st.spliterator();
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

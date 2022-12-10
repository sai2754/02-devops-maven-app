package maccess;
import java.util.*;
public class DemoStack {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try(s;){
        	try {
        	Stack<Integer> st = new Stack<Integer>();
        	while(true) {
        		System.out.println("====Choice====");
    System.out.println
        		("1.push()\n2.pop()\n3.peek()\n4.search()\n5.exit()");
        		System.out.println("Enter the Choice:");
        		int choice = s.nextInt();
        		switch(choice) {
        		case 1:
        			System.out.println("Enter the ele:");
        			st.push(new Integer(s.nextInt()));
        			System.out.println(st.toString());
        			break;
        		case 2:
        			if(st.empty()) {
        		System.out.println("Stack is empty...");
        			}else {
        		System.out.println("Ele removed : "+st.pop());
            			System.out.println(st.toString());
        			}
        			break;
        		case 3:
        			if(st.empty()) {
        		System.out.println("Stack is empty...");
        			}else {
        			System.out.println("peek ele:"+st.peek());
        				System.out.println(st.toString());
        			}
        			break;
        		case 4:
        			if(st.empty()) {
        			System.out.println("Stack is empty...");
        			}else {
        	System.out.println("Enter the ele to be Searched:");
        				Integer ele = new Integer(s.nextInt());
        				int pos = st.search(ele);
        				if(pos>0) {
        				System.out.println("Ele at pos:"+pos);
        				System.out.println(st.toString());
        				}else {
        			System.out.println("Ele not available...");
        				}
        			}
        			break;
        		case 5:
        		System.out.println("Stack Operation Stopped...");
        			System.exit(0);//Stop the program
        			break;
        		default:
        			System.out.println("Invalid Choice...");
        		}//end of switch 
        	}//end of while 
        	}catch(Exception e) {e.printStackTrace();}
        }//end of try-with-resource
	}
}

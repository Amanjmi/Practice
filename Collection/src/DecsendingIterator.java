import java.util.Iterator;
import java.util.LinkedList;

public class DecsendingIterator {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(150);
		ll.add(180);
		ll.add(200);
		ll.add(250);
		System.out.println(ll);
		Iterator itr=ll.descendingIterator();
		while(itr.hasNext()) {
		 Integer i=(Integer)itr.next();
		System.out.print(i+" ,");
		}
	}

}

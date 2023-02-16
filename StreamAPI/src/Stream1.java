import java.util.*;
import java.util.stream.*;
public class Stream1 {
public static void main(String[] args){
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(0);
al.add(5);
al.add(10);
al.add(15);
al.add(20);
al.add(25);
System.out.println(al);//[0,5,10,15,20,25]
//till jdk1.7v
ArrayList<Integer> evenList = new ArrayList<Integer>();
for ( Integer i1: al )
if (i1%2==0)
evenList.add(i1);

System.out.println(evenList);//[0,10,20]
//From JDK1.8V we use Streams
//1. Configuration ===> al.stream()
//2. Processing ===> filter(i->i%2==0).collect(Collectors.toList())

List<Integer> streamList=al.stream().filter(i->i%2==0).collect(Collectors.toList());

System.out.println(streamList);
streamList.forEach(System.out :: println);

}
}

import java.util.ArrayList;

class Launch1{
public static void main(String[] args){
ArrayList<String> l=new ArrayList<String>();
l.add("sachin");
//l.add(10);//C.E:cannot find symbol,method add(int)
methodOne(l);
//l.add(10.5);//C.E:cannot find symbol,method

//add(double)

System.out.println(l);//[sachin, 10, don, true]

}
public static void methodOne(ArrayList l){

l.add(10);
l.add("dhoni");
l.add(true);
}
}


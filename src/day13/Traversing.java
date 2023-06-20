package day13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traversing {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shashank");
        list.add("Surya");
        list.add("Sandesh");
        list.add("Sunny");
        list.add("Sharan");

        System.out.println(list.size());
        //for loop
        System.out.println("for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //enhanced for loop
        System.out.println("enhanced for loop");
        for (String s : list) {
            System.out.println(s);
        }
        //Iterator
        System.out.println("Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //parallel stream
        System.out.println("parallel stream");
        list.parallelStream().forEach(System.out::println);


    }

}

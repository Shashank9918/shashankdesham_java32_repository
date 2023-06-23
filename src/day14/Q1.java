package day14;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>() {{
            add("John");
            add("Mark");
            add("Steve");
            add("Indiana");
            add("Waze");
            add("Harvard");
            add("Morris");
            add("Plano");
            add("Sherwerd");
            add("Mckinney");
        }};

        //Using iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");

        //Using ForEach
        hashSet.forEach(System.out::println);
        System.out.println("============================");

        //Using Streams ForEach
        hashSet.stream().forEach(System.out::println);
        System.out.println("============================");


        //removeDuplicates
        String str = "ansdljkfnjaosd9824bg;sa h;HHPIUhufhb;asgnjksd";
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (char c : str.toCharArray())
            linkedHashSet.add(c);

        linkedHashSet.forEach(System.out::print);

    }

}

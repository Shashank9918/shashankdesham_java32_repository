package day13;


import java.util.ArrayList;
import java.util.List;

    public class RemovingLastObject {
        public static void main(String[] args) {
            List<Student> list = new ArrayList<>();
            list.add(new Student("Shashank","G",3.5));
            list.add(new Student("Surya","K",3.75));
            list.add(new Student("Sandesh","P",3.6));
            list.add(new Student("Sunny","M",3.8));
            list.add(new Student("Sharan","N",3.4));

            list.parallelStream().forEach(System.out::println);
            list.remove(list.size()-1);
            System.out.println("After removing last Object");
            list.parallelStream().forEach(System.out::println);

        }
    }


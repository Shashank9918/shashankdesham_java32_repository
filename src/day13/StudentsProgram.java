package day13;
import java.util.ArrayList;
import java.util.List;
public class StudentsProgram {
    public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("Shashank","G",3.4));
    list.add(new Student("Surya","K",3.75));
    list.add(new Student("Sandesh","P",3.7));
    list.add(new Student("Sunny","M",3.8));
    list.add(new Student("Sharan","N",3.5));

    double avg = 0;
    for (Student s:list) {
        avg+=s.getGPA();
    }
    avg=avg/list.size();
    System.out.println("Avg" + avg);
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getGPA()<avg){
            list.remove(i);
        }
    }
    for (Student s:list) {
        System.out.println(s);
    }
}
}

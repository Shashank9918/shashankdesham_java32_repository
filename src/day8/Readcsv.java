package day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Readcsv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/day8/data.csv"));
        String line;
        List<Student> students = new ArrayList<>();
        br.readLine(); //skip first line or headers
        while ((line = br.readLine()) != null) {
            String[] temp = line.split(",");
            students.add(new Student(temp[0], temp[1], temp[2]));
        }
        br.close();
        Collections.sort(students);
//        System.out.println(students);
        students.stream().forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    String gpa;

    Student(String firstName, String lastName, String gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        if (this.lastName.compareTo(o.lastName) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }
}


package day13;

import java.util.ArrayList;
import java.util.List;

    public class ArrayConversion {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Shashank");
            list.add("Surya");
            list.add("Sandesh");
            list.add("Sunny");
            list.add("Sharan");

            String[] str = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                str[i] = list.get(i);
            }
            for (String s: str) {
                System.out.println(s);
            }
        }
    }


package day6;

public class Reverse_Integer {
    public static void main(String[] args) {
        int num =123456, reverse = 0;
        while(num !=0) {
            int digit = num % 10;
            reverse  = reverse * 10 + digit ;
            num /=10;
        }
        System.out.println(reverse);
    }
}

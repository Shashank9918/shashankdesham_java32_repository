package day7;

public class Largest_Smallest {
    public static void main(String[] args) {
        int[] arr={2,3,8,91,14,54,6};
        int small = arr[0];
        int large = arr[0];

        for(int i=0;i<arr.length;i++) {
            if (small > arr[i]) {
                small = arr[i];

            }
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);

    }
}

package day7;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,3,6,9,12,15};
        int[] temp_arr = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            temp_arr[j] = arr[i];
            j++;
        }
        arr = temp_arr;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}

import java.util.Arrays;

public class minMax {
    static void findMinMax(int arr[]){
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    public static void main(String[] args){
        int a[]={1,423,6,46,34,23,13,53,4};
        Arrays.sort(a);
        System.out.println("Min: " + a[0]);
        System.out.println("Max: " + a[a.length-1]);
        findMinMax(a);
    }
}

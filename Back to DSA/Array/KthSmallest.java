import java.util.Arrays;

public class KthSmallest {
    static int smallest(int k, int arr[]){
        Arrays.sort(arr);
        return arr[k-1];
    }
    static int largest(int k, int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    public static void main(String[] args){
        int arr[] = {7, 10, 4, 3, 20, 15};
        System.out.println(smallest(2, arr));
    }
}

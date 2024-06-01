public class insertionSort {
    static void sort(int arr[]){
        for(int out = 0; out < arr.length; out++){
            for(int in = 0; in < out; in++){
                if(arr[out] <= arr[in]){
                    int temp = arr[in - 1];
                    arr[in - 1] = arr[out];
                    arr[out] = temp;
                }
            }
            
        }
    }
    public static void main(String[] args){
        int arr[] = {5,1,2,7,9,4,6};
        sort(arr);
    }
}

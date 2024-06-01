public class selectionSort {
    static void sort(int arr[]){
        for(int out = 0; out < arr.length; out++){
            int min = out;
            for(int in = out + 1; in < arr.length;in++){
                if(arr[min] > arr[in]){
                    min = in;
                }
            }
            int temp = arr[min];
            arr[min] = arr[out];
            arr[out] = temp;

            for(int i = 0; i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,1,2,7,9,4,6};
        sort(arr);
    }
}

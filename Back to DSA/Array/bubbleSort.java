public class bubbleSort {
    static void sort(int arr[], int n){
        int temp;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int a[] = {5,2,1,4,3};
        sort(a,5);
    }
}

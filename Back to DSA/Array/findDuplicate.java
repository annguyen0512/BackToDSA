public class findDuplicate {
    static void find(int arr[]){
        for(int out = 0; out < arr.length;out++){
            for(int in = out + 1; in < arr.length;in++){
                if(arr[out] == arr[in]){
                    System.out.print(arr[out]+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        int array[]={1, 2, 3, 6, 3, 6, 1, 3};
        find(array);
    }
}

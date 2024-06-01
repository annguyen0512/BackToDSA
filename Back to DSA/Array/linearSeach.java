public class linearSeach {
    static int search(int value, int arr[]){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,100,99,30,52,24,71};
        System.out.println(search(71,arr));
    }
}

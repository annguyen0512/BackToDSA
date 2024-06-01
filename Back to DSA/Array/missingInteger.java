public class missingInteger {
    public static boolean find(int x,int arr[]){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }
    static void missing(int arr[], int value){
        for(int i = 1 ; i < value + 1; i++){
            if(!find(i,arr)){
                System.out.print(i + " ");
            };
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int n = 20;
        missing(arr,n);
    }
}
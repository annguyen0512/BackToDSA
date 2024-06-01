public class binarySearch {
    static int binary(int arr[],int value){
        int lb = 0;
        int ub = arr.length-1;
        int curIn = 0; 
        while(true){
            curIn = (lb+ub)/2;
            if(value == arr[curIn]){
                return curIn;
            }else if(lb > ub){
                return -1;
            }else{
                if(value < arr[curIn]){
                    ub = curIn -1 ;
                }else if(value > arr[curIn]){
                    lb = curIn + 1;
                }
            } 
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.print(binary(arr,6));
    }
}

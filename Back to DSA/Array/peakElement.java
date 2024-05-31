public class peakElement {
    public int findPeak(int arr[]){
        for(int i = 1;i < arr.length;i++){
            System.out.println("Checking "+ arr[i]);
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                System.out.println(arr[i] + " is peak!");
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {5, 10, 20, 15, 0 , 13, 1};
        peakElement a = new peakElement();
        a.findPeak(arr);
    }
}

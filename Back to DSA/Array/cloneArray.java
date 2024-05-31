public class cloneArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int cloneArray[] = arr.clone();

        for(int i : cloneArray){
            System.out.println(i);
        }
    }
}

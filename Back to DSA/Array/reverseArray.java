public class reverseArray {
    static int[] reverse(int arr[],int n){
        int newArr[] = new int[n];
        for(int i = 0; i < n;i++ ){
            newArr[i] = arr[n - i -1];
        }
        return newArr;
    }
    public static void main (String[] args){
        int a[] = {1,2,3,4,5};
        int b[] = reverse(a,5);
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]);
        }
        for(int i = 0; i<b.length;i++){
            System.out.print(b[i]);
        }
    }
}

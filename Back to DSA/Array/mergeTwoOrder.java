public class mergeTwoOrder {
    static int[] merge(int arr1[], int arr2[]){
        int arr[] = new int[arr1.length + arr2.length];
        int a = 0, b = 0;
        for(int i = 0; i < arr.length;i++){
            if(a >= arr1.length){
                arr[i] = arr2[b];
                b++;
            }
            else if(b >= arr2.length){
                arr[i] = arr1[a];
                a++;
            }
            else if(arr1[a] < arr2[b]){
                arr[i] = arr1[a];
                a++;
            }
            else if(arr1[a] > arr2[b]){
                arr[i] = arr2[b];
                b++;
            }
            else{
                arr[i] = arr1[a];
                a++;
                b++;
            }
        }
        return arr;
    }
    static void print(int a[]){
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        print(merge(arr1, arr2));
    }
}

public class commonThree {
    static void find(int arr1[], int arr2[], int arr3[]){
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length
               && k < arr3.length) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            }

            else if (arr1[i] < arr2[j])
                i++;

            else if (arr2[j] < arr3[k])
                j++;

            else
                k++;
        }
    }
    public static void main(String[] args){
        int arr1[] = {1, 5, 10, 20, 40, 80}; 
        int arr2[] = {6, 7, 20, 80, 100}; 
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        find(arr1,arr2,arr3);
        System.out.print("\n");
        int a1[] = {1, 5, 5};
        int a2[] = {3, 4, 5, 5, 10};
        int a3[] = {5, 5, 10, 20};

        find(a1,a2,a3);
    }
}

public class occurance {
    static int occur(int x, int arr[]){
        int count = 0;
        for(int number : arr){
            if(number == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int a[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(occur(2,a));
    }
}

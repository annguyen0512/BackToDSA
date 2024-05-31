public class linearSearch {
    public int search(int value, int arr[]){
        int position = 0;
        for(int item : arr){
            if(item == value){
                System.out.println("value " + item + " at : "+position);
                position++;
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int arr[] = {20, 1,5,4,23,99};
        linearSearch a = new linearSearch();
        a.search(5, arr);
    }
}

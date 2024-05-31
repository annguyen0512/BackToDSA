class main{
    int intArray[] = new int[20];
    int[] intArr = new int[]{1,2,3,4,5,6,7,8,9};

    public void print(int array[]){
        for(int i : array){
            System.err.println("Element: " + i);
        }
    }


    public static void main(String[] args){
        int[] intArr = new int[5];
        intArr[0] = 1;
        intArr[2] = 6;
        intArr[1] = 1;
        intArr[4] = 10;
        intArr[3] = 1;
        main newMain = new main();
        newMain.print(intArr);
    }   
}



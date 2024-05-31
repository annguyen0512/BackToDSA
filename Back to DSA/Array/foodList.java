public class foodList {

    public static void main (String[] args){
        food khaiVi = new food("fish", 50);
        food drink = new food("lemonade water", 20);
        food main = new food("kobe beef", 20);
        food[] foodList = new food[]{khaiVi,drink,main};
        for (food i : foodList){
            System.out.println(i.name +" : "+ i.price );
        }
    }
}

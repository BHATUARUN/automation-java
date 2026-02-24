package test;
import java.util.ArrayList;

public class assignq25 {

    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Before removal: " + fruits);

        fruits.remove(2);

        System.out.println("After removal: " + fruits);
    }
}
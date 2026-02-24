package test;
import java.util.ArrayList;

public class assignq24 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Before update: " + fruits);
        fruits.set(1, "Orange");

        System.out.println("After update: " + fruits);
    }
}
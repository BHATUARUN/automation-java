package test;
import java.util.ArrayList;
public class assignq22{
	    public static void main(String[] args) {
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Mango");

	        
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	       
	        fruits.forEach(System.out::println);
	    }
	}

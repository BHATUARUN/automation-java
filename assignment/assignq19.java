package test;
public class assignq19 {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]); 
            int x = 10 / 0;             
        }

        catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }

        catch (Exception e) {
            System.out.println("Other error");
        }

        System.out.println("Program continues...");
    }
}
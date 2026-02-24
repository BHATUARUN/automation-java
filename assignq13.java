package test;

public class assignq13{
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        sum = sum + arr[0];
        sum = sum + arr[1];
        sum = sum + arr[2];
        sum = sum + arr[3];
        sum = sum + arr[4];

        double avg = sum / 5.0;

        System.out.println("Average = " + avg);
    }
}
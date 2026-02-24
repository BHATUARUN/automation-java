package test;
import java.util.Scanner;

// Custom exception class
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class assignq31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 2000;

        System.out.print("Enter withdraw amount: ");
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                int diff = withdraw - balance;
                // Throw custom exception
                throw new InsufficientBalanceException(
                    "Sorry, insufficient balance, you need more " + diff + " Rs. To perform this transaction."
                );
            } else {
                balance -= withdraw;
                System.out.println("Transaction successful! Remaining balance: " + balance);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
package webdriver;

import org.testng.annotations.Test;

public class groupdemo {

    @Test(groups="smoke")
    public void login() {

        System.out.println("Login Test");
    }

    @Test(groups="smoke")
    public void search() {

        System.out.println("Search Test");
    }

    @Test(groups="regression")
    public void payment() {

        System.out.println("Payment Test");
    }
}
package test;
abstract class Parent {
    abstract void message();
}

class Child1 extends Parent {
    void message() {
        System.out.println("Hello from Child1");
    }
}

class Child2 extends Parent {
    void message() {
        System.out.println("Hello from Child2");
    }
}

public class assignq29 {
    public static void main(String[] args) {
        Parent obj1 = new Child1();
        Parent obj2 = new Child2();

        obj1.message();
        obj2.message();
    }
}
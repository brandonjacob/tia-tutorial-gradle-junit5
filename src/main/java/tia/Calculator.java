package tia;

public class Calculator {

    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int a, int b) {
        a = a * b;
        a = doSomething(a);
        return a + b;
    }
    
    private int doSomething(int a) {
        return a + 1001;
    }

    public int minus(int a, int b) {
        System.out.println("gi");
        return a - b;
    }

}

package polymorphism;

public class Calculator {
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }
    public int add (int a, int b, int c) {
        return a + b + c;
    }
    public int add () {
        return 1;
    }

    public double add (int a, int b, int c , int d) {
        return a + b + c + d;
    }
}

package overload;

public class OverLoad {

    public static void main(String[] args) {
        int x = add(1, 2, 3, 4);
        double y = add(1.5,3.8,5.2);
        System.out.println(x);
        System.out.println(y);
    }

    static int add(int a, int b) {
        System.out.println("This is #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is #3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("This is #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is #6");
        return a + b + c + d;
    }

}

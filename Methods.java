package methods;

public class Methods {

    public static void main(String[] args) {
        String name = "Bob";
        int age = 30;
        hello(name, age);

        int x = 7;
        int y = 8;
        
        int z = add(x, y);
        System.out.println(z);

    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + " You are " + age);
    }

    static int add(int x, int y) {
        int z = x+y;
        return z;
    }
}

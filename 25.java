package prf;

public class Prf {

    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = 'Đ';
        String myString = "Maru";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("My boolean: %b", myBoolean);
        System.out.println("");
        
        System.out.printf("My char: %c", myChar);
        System.out.println("");
        
        System.out.printf("My String: %10s", myString);
        System.out.println("");
        
        System.out.printf("My int: %d", myInt);
        System.out.println("");
        
        System.out.printf("My double: %.2f", myDouble);
        System.out.println("");

        System.out.printf("This is my number: %d", 7);
        System.out.println("");
    }

}


package me;

public class Me {

    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;
        
        double z = Math.min(x, y);
        double k = Math.max(x, y);
        double g = Math.abs(y);
        double h = Math.sqrt(x);
        double j = Math.round(x);
        double m = Math.ceil(x);
        double n = Math.floor(x);
        
        System.out.println("MIN : " + z);
        System.out.println("MAX : " + k);
        System.out.println("ABS : " + g);
        System.out.println("Sqrt : " + h);
        System.out.println("Round : " + j);
        System.out.println("Ceil : " + m);
        System.out.println("Floor : " + n);
    }
    
}

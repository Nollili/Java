
package pkg15_feladat;

import java.util.Stack;
import static pkg15_feladat.Metodusok.Behelyez;
import static pkg15_feladat.Metodusok.Kivesz;

public class Main {


    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int elem = 0;
        System.out.println("Behelyez : ");
        System.out.println("Verem : " + stack + "\n");
        Behelyez(stack, 10);
        System.out.println("Verem : " + stack + "\n");
        Behelyez(stack, 15);
        System.out.println("Verem : " + stack + "\n");
        Behelyez(stack, 26);
        System.out.println("Verem : " + stack + "\n");
        Behelyez(stack, 34);
        System.out.println("Verem : " + stack + "\n");
        System.out.println("Kivetel : ");
        elem = Kivesz(stack);
        System.out.println(elem + "\n");
        elem = Kivesz(stack);
        System.out.println(elem + "\n");
        elem = Kivesz(stack);
        System.out.println(elem + "\n");
        elem = Kivesz(stack);
        System.out.println(elem + "\n");
        
    }
    
}

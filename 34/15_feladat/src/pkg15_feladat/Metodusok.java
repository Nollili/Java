
package pkg15_feladat;
import java.util.Stack;

public class Metodusok {
    static void Behelyez(Stack<Integer> stack, int x){
        stack.push(x);
        System.out.println("push -> " + x);
    }
    static int Kivesz(Stack<Integer> stack){
        int elem = stack.pop();
        System.out.println(elem);
        System.out.println("Verem : " + stack + "\n");
        return elem;
    }
}

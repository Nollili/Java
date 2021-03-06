
package arrlists;

import java.util.ArrayList;

public class Arrlists {

    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Fries");
        food.add("Hotdog");
        
        food.set(3, "sushi");
        food.remove(0);
        food.clear();
        
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
    
}


package animals;

import java.util.ArrayList;

public class Animals {

    public static void main(String[] args) {
       
        //String[] animals = {"cat", "dog", "rat", "bird"};
        
        ArrayList<String> animals = new ArrayList();
        
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Tiger");
        animals.add("Horse");
        animals.add("Giraffe");
        animals.add("Lion");
               
        
        for(String i : animals) {
            System.out.println(i);
        }
    }
    
}

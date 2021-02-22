package shopping;

import java.util.ArrayList;

public class Shopping {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> shoppingList = new ArrayList();
        
        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("Bananabread");

        ArrayList<String> groceryList = new ArrayList();

        groceryList.add("salad");
        groceryList.add("eggs");
        groceryList.add("meat");

        ArrayList<String> drinkList = new ArrayList();

        drinkList.add("cola");
        drinkList.add("orange juice");

        shoppingList.add(bakeryList);
        shoppingList.add(groceryList);
        shoppingList.add(drinkList);
        

        System.out.println(shoppingList.get(1).get(2));
    }

}

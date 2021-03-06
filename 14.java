package halp;

import java.util.Scanner;

public class Halp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String age = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        

        do {
            System.out.println("Enter your age: ");
            age = scanner.nextLine();
        }while(age.isBlank());
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " .");
        
    


    }
    
}

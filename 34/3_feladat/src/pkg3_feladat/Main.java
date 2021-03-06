
package pkg3_feladat;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int szam;
        boolean igaze = false;
        System.out.println("Kérem adjon meg egy pozitív egész számot!");
        Scanner sc = new Scanner(System.in);
        szam = sc.nextInt();
        sc.close();
        if ( szam <= 0) {
            System.out.println("Hibás adat.");
        } else {
            if ( szam % 3 == 0 && szam % 5 == 0 && szam % 2 == 0 ){
                System.out.println(szam + " osztható 3-mal, 2-vel és 5-tel maradék nélkül");
                igaze = true;
                return;
            }
            if ( szam % 3 == 0 && szam % 5 == 0 ){
                System.out.println(szam + " osztható 3-mal és 5-tel maradék nélkül");
                igaze = true;
                return;
            }
            if ( szam % 2 == 0 ){
                System.out.println(szam + " osztható 2-vel maradék nélkül");
                igaze = true;
                return;
            }
            if ( szam % 3 == 0 ){
                System.out.println(szam + " osztható 3-mal maradék nélkül");
                igaze = true;
                return;
            }
            if ( !igaze ){
                System.out.println(szam + " nem osztható 2-vel 3-mal és 5-tel maradék nélkül");
                return;
            }
        }
        
    }
    
}

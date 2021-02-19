package pkg2_feladat;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int szam;
        System.out.println("Kérem adjon meg egy egész számot!");
        Scanner sc = new Scanner(System.in);
        szam = sc.nextInt();
        sc.close();
        if(szam < 0){
            System.out.println(szam + " negatív, kisebb mint 0!");
        }
        else if(szam < 10)
            System.out.println(szam + " kisebb mint 10!");
        else
            System.out.println(szam + " nem kisebb mint tíz, és nem negatív!");
    }
    
}

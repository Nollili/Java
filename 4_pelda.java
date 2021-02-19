
package pkg4_feladat;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int szam1, szam2, muvelet;
        String muveletiJel;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kerem adja meg az elso szamot: ");
        szam1 = sc.nextInt();
        
        System.out.println("Kerem adja meg a masodik szamot: ");
        szam2 = sc.nextInt();
        
        System.out.println("Kerem adja meg az elvegzendo muvelet jeléhez rendelt értéket(1:osszeadas,2:kivonas,3:szorzas,4:osztas)");
        muveletiJel = sc.next();//muvelet = sc.nextInt();
        
        sc.close();
        
        switch(muveletiJel){
            case "+":
                System.out.println(szam1 + " és " + szam2 + " osszege :" + (szam1 + szam2));
                break;
            case "-":
                System.out.println(szam1 + " és " + szam2 + " kulonbsege :" + (szam1 - szam2));
                break;
            case "*":
                System.out.println(szam1 + " és " + szam2 + " szorzata :" + (szam1 * szam2));
                break;
            case "/":
                System.out.println(szam1 + " és " + szam2 + " hányadosa :" + (szam1 / szam2));
                break;
            default:
                System.out.println("Hibas muveletet adott meg!");
                break;
        }
    }
    
}

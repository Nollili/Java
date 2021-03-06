
package pkg4_feladat;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int szam1, szam2, muvelet;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kérem adja meg az első számot: ");
        szam1 = sc.nextInt();
        
        System.out.println("Kérem adja meg a második számot: ");
        szam2 = sc.nextInt();
        
        System.out.println("Kérem adja meg az elvégzendő műveleti jelhez rendelt értéket(1:összeadás, 2:kivonás, 3:szorzás, 4:osztás) : ");
        muvelet = sc.nextInt();
        sc.close();
        
        
        switch(muvelet){
            case 1:
                System.out.println(szam1 + " és " + szam2 + " összege: " + (szam1 + szam2));
                break;
            case 2:
                System.out.println(szam1 + " és " + szam2 + " különbsége: " + (szam1 - szam2));
                break;
            case 3:
                System.out.println(szam1 + " és " + szam2 + " szorzata: " + (szam1 * szam2));
                break;
            case 4:
                System.out.println(szam1 + " és " + szam2 + " hányadosa: " + (szam1 / szam2));
                break;
            default:
                System.out.println("Hibás műveletet adott meg");
                break;    
        }                
    }
    
}

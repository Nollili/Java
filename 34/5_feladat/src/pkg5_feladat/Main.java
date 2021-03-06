
package pkg5_feladat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int i, n, x;
       double atlag, osszeg = 0;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Hány adatot kíván feldolgozni?");
       n = sc.nextInt();
       i = 0;
       
       
       while( i < n) {
           System.out.println("Adja emg az " + (i+1) + ". adatot: ");
           x = sc.nextInt();
           osszeg += x;
           i++;
        }
       
       sc.close();
       
       atlag = osszeg / n;
       System.out.println("Az adatok összege : " + osszeg);
       System.out.println("Az adatok átlaga : " + atlag);
       
     
        
    }
    
}

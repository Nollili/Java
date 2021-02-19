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
        
        while(i < n){
            System.out.println("Adja meg az " + (i+1) + ". adatot: ");
            x = sc.nextInt();
            osszeg += x; //osszeg = osszeg + x;
            i++;
        }
        
        do{
            System.out.println("Adja meg az " + (i+1) + ". adatot: ");
            x = sc.nextInt();
            osszeg += x; //osszeg = osszeg + x;
            i++;
        }while(i < n);
        
        for(;i < n; i++){
            System.out.println("Adja meg az " + (i+1) + ". adatot: ");
            x = sc.nextInt();
            osszeg += x; //osszeg = osszeg + x;
        }
        
        sc.close();
        atlag = osszeg / n;
        System.out.println("Az adatok osszege : " + osszeg);
        System.out.println("Adatok átlaga: " + atlag);
    }
    
}

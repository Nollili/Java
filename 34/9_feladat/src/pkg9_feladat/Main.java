
package pkg9_feladat;

import java.util.Scanner;


class OsztalyozOsztaly{
    static int Osztalyoz(int pontszam){
        int erdemjegy = 0;
        if( pontszam >= 0 && pontszam <= 100){
            if(pontszam >= 90) erdemjegy = 5;
            else if(pontszam >= 70) erdemjegy = 4;
            else if(pontszam >= 60) erdemjegy = 3;
            else if(pontszam >= 50) erdemjegy = 2;
            else erdemjegy = 1;
        }else{
            System.out.println("Hibas adatot adott meg!");
        }
        return erdemjegy;
    }
    
    static void ErdemjegySzovegesen(int jegy){
        if(jegy >= 1 && jegy <= 5){
            switch(jegy){
                case 1:
                    System.out.println("Erdemjegy : elegtelen");
                    break;
                case 2:
                    System.out.println("Erdemjegy : elegseges");
                    break;
                case 3:
                    System.out.println("Erdemjegy : kozepes");
                    break;
                case 4:
                    System.out.println("Erdemjegy : jo");
                    break;
                case 5:
                    System.out.println("Erdemjegy : jeles");
                    break;
            }
        }else{
            System.out.println("Hibas jegye adott meg!");
        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        int dolgozatPont = 0, erdemjegy = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("A dolgozat pontszama : ");
            dolgozatPont = sc.nextInt();
        }while(dolgozatPont < 0 || dolgozatPont > 100);
        sc.close();
        erdemjegy = OsztalyozOsztaly.Osztalyoz(dolgozatPont);
        OsztalyozOsztaly.ErdemjegySzovegesen(erdemjegy);
    }
    
}

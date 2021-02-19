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
        if(szam <= 0)
            System.out.println("Hibás adat!");
        else{
            if(szam % 2 == 0){
                System.out.println(szam + " osztható 2-vel, tehát páros!");
                igaze = true;
            }
            if(szam % 3 == 0){
                System.out.println(szam + " oszthato 3-al maradék nélkül!");
                igaze = true;
            }
            if(szam % 5 == 0){
                System.out.println(szam + " oszthato 5-el maradék nélkül!");
                igaze = true;
            }
            if(szam % 3 == 0 && szam % 5 == 0){
                System.out.println(szam + " oszthato 3-al, és 5-el!");
                igaze = true;
            }
            if(!igaze)          //!false=true; !true=false
                System.out.println(szam + " nem oszthato 2-vel, 3-al, 5-el!");
        }
    }
    
}

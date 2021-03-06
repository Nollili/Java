
package pkg13_feladat;

import java.util.Scanner;

abstract class Teglalap{
    protected double a_oldal, b_oldal, kerulet, terulet;
    Teglalap(double a, double b){
        a_oldal = a;
        b_oldal = b;
    }
    public abstract void Terulet();
    public abstract void Kerulet();
    public abstract void Kiir();
}

interface Teglatest{
    void Terfogat();
    void Felszin();
}

class Alakzat extends Teglalap implements Teglatest{
    private double c_oldal, terfogat, felszin;
    
    Alakzat(double a1, double b1, double c1){
        super(a1, b1);      //meghívja az ősosztály konstruktorát
        c_oldal = c1;
    }
    
    @Override
    public void Terulet() {
        terulet = a_oldal * b_oldal;
    }

    @Override
    public void Kerulet() {
        kerulet = 2 * (a_oldal + b_oldal);
    }

    @Override
    public void Terfogat() {
        terfogat = a_oldal * b_oldal * c_oldal;
    }

    @Override
    public void Felszin() {
        felszin = 2 * (a_oldal * b_oldal + a_oldal * c_oldal + b_oldal * c_oldal);
    }
    
    @Override
    public void Kiir() {
        System.out.println("Teglalap terulete : " + terulet);
        System.out.println("Teglalap kerulete : " + kerulet);
        System.out.println("Teglatest felszine : " + felszin);
        System.out.println("Teglatest terfogata : " + terfogat);
    }
}

public class Main {


    public static void main(String[] args) {
       
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg a teglatest a teglatest harom oldalat!");
        System.out.println("a oldal: ");
        a = sc.nextDouble();
        System.out.println("b oldal: ");
        b = sc.nextDouble();
        System.out.println("c oldal: ");
        c = sc.nextDouble();
        
        Alakzat alakz = new Alakzat(a, b, c);
        alakz.Terulet();
        alakz.Kerulet();
        alakz.Terfogat();
        alakz.Felszin();
        alakz.Kiir();
        
    }
    
}

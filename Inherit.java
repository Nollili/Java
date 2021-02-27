
package inherit;

import java.util.Scanner;

class OsOsztaly{
    protected double x, y, eredmeny;
    OsOsztaly( double x1, double y1){
        x = x1;
        y = y1;
        eredmeny = 0;
    }
    
    public void Szamol(){
        eredmeny = (x + y) / 2;
    }
    
    public void Kiiras(){
        System.out.println("x = " + x +" y = " + y);
        System.out.println("Szamtani kozep : " + eredmeny);
    }
}

class SzarmaztatottOszt extends OsOsztaly{
    private double osszeg;
    SzarmaztatottOszt(double x1, double y1){
        super(x1, y1);
        osszeg = 0;
    }
    
    public void Szamol(){
        eredmeny = Math.sqrt(x * y);
    }
    
    public void Kiiras(){
        System.out.println("x = " + x +" y = " + y);
        System.out.println("Mertani kozep : " + eredmeny);
    } 
}

public class Inherit {

    public static void main(String[] args) {
       double xx, yy;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. adat : ");
        xx = sc.nextDouble();
        System.out.println("2. adat : ");
        yy = sc.nextDouble();
        sc.close();
        
        OsOsztaly osOszt = new OsOsztaly(xx, yy);
        osOszt.Szamol();
        osOszt.Kiiras();
        
        SzarmaztatottOszt szOszt = new SzarmaztatottOszt(xx, yy);
        szOszt.Szamol();
        szOszt.Kiiras();
    }
    
}

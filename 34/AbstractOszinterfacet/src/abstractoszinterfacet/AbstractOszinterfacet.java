
package abstractoszinterfacet;

import java.util.Scanner;

abstract class SZMKozep{
    abstract void SzamtaniKozep();
    abstract void MertaniKozep();
}

interface HatvanyozGyokvonas{
    public void Hatvanyoz();
    public void Gyokvonas();
}

class Muveletek extends SZMKozep implements HatvanyozGyokvonas{
    private double x, y, eredmeny;
    //String muveletiJel;
    
    Muveletek(double a, double b){
        x = a;
        y = b;
        //muveletiJel = muvJel;
    }
    
    public void SzamtaniKozep(){
        eredmeny = (x + y) / 2;
        System.out.println("x es y szamtani kozepe: " + eredmeny);
    }
    
    public void MertaniKozep(){
        eredmeny = Math.sqrt(x * y);
        System.out.println("x es y mertani kozepe: " + eredmeny);
    }
    
    public void Hatvanyoz(){
        eredmeny = Math.pow(x, y);
        System.out.println("x^y : " + eredmeny);
    }
    
    public void Gyokvonas(){
        eredmeny = Math.pow(x, 1/y);
        System.out.println("x^(1/y) : " + eredmeny);
    }
}

public class AbstractOszinterfacet {

    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg az elso szamot!");
        x = sc.nextDouble();
        System.out.println("Kerem adja meg a masodik szamot!");
        y = sc.nextDouble();
        sc.close();
        
        System.out.println("x = " + x + "; y = " + y);
        Muveletek muv1 = new Muveletek(x, y);
        muv1.SzamtaniKozep();
        muv1.MertaniKozep();
        muv1.Hatvanyoz();
        muv1.Gyokvonas();
        
        Muveletek muv2 = new Muveletek(2, 4);
        muv2.SzamtaniKozep();
        muv2.MertaniKozep();
        muv2.Hatvanyoz();
        muv2.Gyokvonas();
    }
    
}

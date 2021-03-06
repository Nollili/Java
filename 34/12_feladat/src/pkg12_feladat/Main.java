
package pkg12_feladat;

import java.util.Scanner;

class TombKezeles{
    private int x[], osszeg, min, max;
    private final int db;
    private double atlag;
    
    TombKezeles(int n){
        db = n;
        x = new int[n];
        try{
            for(int i = 0; i < db; i++)
                x[i] = (int)(20 * Math.random() + 1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indexhatar tullepes!");
            System.exit(1);
        }
        
        max = min = osszeg = 0;
        atlag = 0.;
    }
    
    public void TombOsszeg(){
        for(int i = 0; i < db; i++)
            osszeg += x[i];     //osszeg = osszeg + x[i]
    }
    
    public void TombAtlag(){
        TombOsszeg();
        atlag = (double)osszeg / db;
    }
    
    public void MaxKereses(){
        max = x[0];
        for(int i = 0; i < db; i++)
            if(x[i] > max)
                max = x[i];
    }
    
    public void MinKereses(){
        min = x[0];
        for(int i = 0; i < db; i++)
            if(x[i] < min)
                min = x[i];
    }
    
    public void Kiiratas(){
        System.out.println("A tomb elemei : ");
        for(int i = 0; i < db; i++){
            System.out.print(x[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Tomb elemeinek osszege : " + osszeg);
        System.out.println("A tomb elemeinek atlaga : " + atlag);
        System.out.println("A tomb legnagyobb eleme : " + max);
        System.out.println("A tomb legkisebb eleme : " + min);
    }
}


public class Main {


    
    public static void main(String[] args) {
       
        int n = 0;
        try{
            System.out.println("Kerem adja meg a tomb elemeinek a szamat : ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sc.close();
            TombKezeles tk = new TombKezeles(n);
            tk.TombAtlag();
            tk.MaxKereses();
            tk.MinKereses();
            tk.Kiiratas();
        }

        catch(java.util.InputMismatchException e){
            System.out.println("Ervenytelen szam!");
        }

    }
    
}

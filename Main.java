
package pkg11edik;

import java.util.Scanner;

class TombKezeles {

    private int x[], osszeg, min, max;
    private final int db;
    private double atlag;

    TombKezeles(int n) {
        db = n;
        x = new int[n];
        for (int i = 0; i < db; i++) {
            x[i] = (int) (20 * Math.random() + 1);
            max = min = osszeg = 0;
            atlag = 0.;
        }
    }

    public void TombOsszeg() {
        for (int i = 0; i < db; i++) {
            osszeg += x[i];
        }
    }

    public void Tombatlag() {
        TombOsszeg();
        atlag = (double) osszeg / db;
    }

    public void MaxKeres() {
        max = x[0];
        for (int i = 0; i < db; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
    }

    public void MinKeres() {
        min = x[0];
        for (int i = 0; i < db; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
    }

    public void Kiiratas() {
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < db; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println("Tomb elemeinek osszege: " + osszeg);
        System.out.println("Tomb elemeinek atlaga: " + atlag);
        System.out.println("Tomb legkisebb eleme: " + min);
        System.out.println("Tomb legnagyobb eleme: " + max);
    }

}

public class Main {


    public static void main(String[] args) {
        System.out.println("Kérem adja meg a tömb nagyságát:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TombKezeles tk = new TombKezeles(n);

        tk.Tombatlag();
        tk.MaxKeres();
        tk.MinKeres();
        tk.Kiiratas();
    }
    
}


package pkg16_feladat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        int db;
        System.out.println("Kerem adja meg hany adattal kivan kiirni!");
        Scanner sc = new Scanner(System.in);
        db = sc.nextInt();
        int[] szamok = new int[db];
        for(int i = 0; i < db; i++){
            System.out.println((i+1) + ". szam : ");
            szamok[i] = sc.nextInt();
        }
        sc.close();
        
        File file = new File("szamok.txt");
        System.out.println("\nSzamok kiirasa a szamok.txt fajlba!");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        //pw.print(db);
        //pw.print(',');
        for(int i = 0; i < db; i++){
            pw.print(szamok[i]);
            pw.print(',');
            System.out.println(szamok[i]);
        }
        pw.close();
    }
    
}

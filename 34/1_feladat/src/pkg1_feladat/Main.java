
package pkg1_feladat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
       
        System.out.println("Adjon meg egy egész számot és megmondom osztható-e 2-vel.");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        String szamString = be.readLine();
        int szam = Integer.parseInt(szamString);
        
        if(szam%2 == 0){
            System.out.println("A " + szam + " osztható 2-vel.");
            return;
        }
        System.out.println("A " + szam + " nem osztható maradék nélkül 2-vel.");
    }
    
}

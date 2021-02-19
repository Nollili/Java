

package bemutatkozas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bemutatkozas {


    public static void main(String[] args) throws IOException {
        System.out.println("Kérlek add meg a nevedet: ");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        String nev = be.readLine();
        System.out.println("Üdvözöllek " + nev + "!");
    }
    
}

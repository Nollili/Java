/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bemutatkozas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Seres Sándor
 */
public class Bemutatkozas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Kérlek add meg a nevedet: ");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        String nev = be.readLine();
        System.out.println("Üdvözöllek " + nev + "!");
    }
    
}

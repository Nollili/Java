
package pkg17_feladat;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Main {


    public static void main(String[] args) {
        
        RandomAccessFile randomFile;
        String sorok;
        int osszeg = 0;
        int[] szamok = new int[20];

        try
        {
            randomFile = new RandomAccessFile("szamok.txt","r");

            int db = 0;
            sorok = randomFile.readLine();

            while( sorok != null )
            {
              szamok[db] = Integer.parseInt(sorok);
              db++;
              sorok = randomFile.readLine();
            }

            randomFile.close();
            
            for(int i = 0; i < db; i++){
                osszeg += szamok[i];
                System.out.println(szamok[i]);
            }
            
            System.out.println("Osszeg : " + osszeg);
        }
        catch( IOException e )
        {
            System.out.println("Fajlkezelesi problema lepett fel!");
        }

    }
    
    }
    


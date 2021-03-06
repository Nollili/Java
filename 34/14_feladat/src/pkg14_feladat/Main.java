
package pkg14_feladat;

import java.util.Random;
import java.util.Vector;

class DinamVektor{
    static void Feltoltes(Vector vec, int db){
        for(int i = 0; i < db; i++)
            vec.add(new Random().nextInt(10));
    }
    static void Rendezes(Vector vektor){
        for(int i = 0; i < vektor.size(); i++)
            for(int j = 0; j < vektor.size(); j++)
                if((int)vektor.elementAt(j) > (int)vektor.elementAt(i)){
                    int e = (int)vektor.elementAt(i);
                    vektor.set(i, vektor.elementAt(j));
                    vektor.set(j, e);
                }
    }
}

public class Main {

    public static void main(String[] args) {
        Vector vector = new Vector();
        System.out.println("Feltoltes : ");
        DinamVektor.Feltoltes(vector, 10);
        System.out.println(vector.toString());
        System.out.println("Rendezes : ");
        DinamVektor.Rendezes(vector);
        System.out.println(vector.toString());
    }
    
}

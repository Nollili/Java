/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipuskonverziok;

/**
 *
 * @author noemi
 */
public class TipusKonverziok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Automatikus típuskonverzió
        char c = 'c';
        int i = c;
        System.out.println(i);
        
        float f = (float) 10.54267;
        double d = f;
        System.out.println(d);
        
        
        //Kényszerített típuskonverzió
        int j = 555;
        byte b = (byte) j;
        System.out.println(b);
        
        float f2 = (float) 10.55;
        int i2 = (int) f2;
        System.out.println(i2);
    }
    
}

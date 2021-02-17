/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumpelda;

/**
 *
 * @author Seres Sándor
 */
public class EnumPelda {

    /**
     * @param args the command line arguments
     */
    public enum Allat{kutya, macska, farkas, tigris}
    
    public static void main(String[] args) {
        Allat allat = Allat.macska;
        System.out.println("Az állat neve : " + allat);
        System.out.println("Az állat sorszáma : " + allat.ordinal());
    }
    
}

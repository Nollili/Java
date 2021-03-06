
package enumpelda;



public class EnumPelda {

    
    public enum Allat{kutya, macska, farkas, tigris}

    public static void main(String[] args) {
        Allat allat = Allat.macska;
        System.out.println("Az allat neve " + allat);
        System.out.println("Az allat sorszama? " + allat.ordinal());
    }
    
}

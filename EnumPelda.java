package enumpelda;


public class EnumPelda {


    public enum Allat{kutya=3, macska, farkas, tigris}
    
    public static void main(String[] args) {
        Allat allat = Allat.macska;
        System.out.println("Az állat neve : " + allat);
        System.out.println("Az állat sorszáma : " + allat.ordinal());
    }
    
}

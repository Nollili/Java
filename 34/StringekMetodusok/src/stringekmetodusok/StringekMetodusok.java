
package stringekmetodusok;

public class StringekMetodusok {

    public static void main(String[] args) {
       int i = 128;
        String nev1 = new String("Balazs Peter");
        String nev2 = "Demeter Béla";
        
        char[] nevTomb = {'P','e','t','e','r',' ','F','e','r','e','n','c'};
        String nev3 = new String(nevTomb);
        System.out.println(nev3);
        
        String nev4 = " Seres Sandor ";
        String nev5 = "peter ferenc";
        
        System.out.println(nev3.equals(nev2));
        System.out.println(nev3.equalsIgnoreCase(nev2));
        System.out.println(nev3.charAt(4));
        System.out.println(nev3.toUpperCase());
        System.out.println(nev3.toLowerCase());
        System.out.println(nev3.length());
        System.out.println(nev4.trim());
        System.out.println(nev3.replace('r', 's'));
        System.out.println(nev3.substring(6, 12));
        System.out.println(nev3.compareTo(nev4));
        System.out.println(nev3.compareToIgnoreCase(nev5));
        System.out.println(nev3.equals(nev2));      
    }
    
}

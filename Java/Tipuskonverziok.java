
package tipuskonverziok;

public class Tipuskonverziok {

    public static void main(String[] args) {
        //Automatikus típuskonverzió
        char c = 'c';
        int i = c;
        System.out.println(i);
        
        float f = (float) 10.54267;
        double d = f;
        System.out.println(d);
        
        
        //Kényszerített típuskonverzió
        int i = 555;
        byte b = (byte) i;
        System.out.println(b);
        
        float f2 = (float) 10.55;
        int i2 = (int) f2;
        System.out.println(i2);
    }
    
}

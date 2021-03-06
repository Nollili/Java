
package meto;


class Metodus{

    public static int Max(int x, int y){
        
        if(x > y) {
            return x;
        }else
            return y;
    }
    
    public static float Max(float x, float y){
        
       float max = (x > y) ? x : y;
       return max;
    }
}


public class Meto {


    public static void main(String[] args) {
        
        int x = 5, y = 4;
        float fx = (float) 17.5, fy = (float) 10.6;
        double dx = 20.3, dy = 30.7;
        
        System.out.println("int max: " + Metodus.Max(x, y));
        System.out.println("float max: " + Metodus.Max(fx, fy));
    }
    
}

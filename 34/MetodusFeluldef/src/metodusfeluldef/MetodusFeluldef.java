
package metodusfeluldef;

class Metodusok {
    public static int Max(int x, int y){
        if( x > y) {
            return x;
        }else
            return y;
    }
    
    public static float Max(float x, float y){
        float max = (x > y) ? x : y;
        return max;
    }
    
    public static double Max(double x, double y){
        return (x > y) ? x : y;
    }

}

public class MetodusFeluldef {
    


    public static void main(String[] args) {
      
        int x = 5, y = 4;
        float fx = (float) 17.5, fy = (float) 10.6;
        double dx = 20.3, dy = 30.6;
        
        System.out.println("int max : " + Metodusok.Max(x, y));
        System.out.println("float max : " + Metodusok.Max(fx, fy));
        System.out.println("double max : " + Metodusok.Max(dx, dy));
        
    }
    
}

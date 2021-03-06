
package destrukrot;

class TesztOsztály{
    private int x;
    protected int y;
    public int z;
    
    TesztOsztály(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Konstruktor");
    }
    
    public void Kiiras(int a, int b, int c){
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
    }
    
    protected void finalize(){
        System.out.println("Destruktor");
    }
    
}

public class Destrukrot {


    public static void main(String[] args) {
        int a = 4, b = 5, c = 6;
        TesztOsztály to = new TesztOsztály(a, b, c);
        to.Kiiras(a, b, c);
        //to.finalize();
        int v = to.y;   //protected
        int w = to.z;   //public        
        to = null;
        System.gc();
        System.out.println("Main metodus");
    }
    
}

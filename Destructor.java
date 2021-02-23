package destructor;

class TesztOsztaly{
    private int x;
    protected int y;
    public int z;
    
    TesztOsztaly(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Konstruktor");
    }
    
    public void Kiiras(int a, int b, int c){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    
    protected void finalize(){
        System.out.println("Destruktor");
    }
}

public class Destructor {


    public static void main(String[] args) {
        
        int a = 4, b = 5, c = 6;
        
        TesztOsztaly to = new TesztOsztaly(a, b, c);
        to.Kiiras(a, b, c);
        to.finalize();
        to = null;
        System.gc();
        System.out.println("Main metodus");
        
    }
    
}

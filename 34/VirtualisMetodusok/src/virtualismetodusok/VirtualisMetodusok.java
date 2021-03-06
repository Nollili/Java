
package virtualismetodusok;

class Szamolas1{
    protected int x1, y1, eredmeny1;
    
    Szamolas1(int x, int y){
        x1 = x;
        y1 = y;
        eredmeny1 = 0;
    }
    public int Szamol(){
        eredmeny1 = x1 + y1;
        return eredmeny1;
    }
}

class Szamolas2 extends Szamolas1{
    
    Szamolas2(int x, int y){
        super(x, y);
    }
    
    @Override
    public int Szamol(){
        eredmeny1 = x1 * y1;
        return eredmeny1;
    }
}

class Szamolas3 extends Szamolas2{
    
    Szamolas3(int x, int y){
        super(x,y);
    }
    
    @Override
    public int Szamol(){
        eredmeny1 = x1 % y1;
        return eredmeny1;
    }
}

public class VirtualisMetodusok {


    public static void main(String[] args) {
        
        int a = 7, b = 5;
        
        Szamolas1 sz1 = new Szamolas1(a, b);
        System.out.println("Szamol1 metodus : " + sz1.Szamol());
        
        Szamolas2 sz2 = new Szamolas2(a, b);
        System.out.println("Szamol2 metodus : " + sz2.Szamol());
        
        Szamolas3 sz3 = new Szamolas3(a, b);
        System.out.println("Szamol3 metodus : " + sz3.Szamol());
    }
    
}

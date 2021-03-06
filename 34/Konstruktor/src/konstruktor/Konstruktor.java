package konstruktor;

class Peldaosztaly{
    private int x, y, eredmeny;
    
    Peldaosztaly(){
        x = y = 1;
        eredmeny = 0;        
    }
    
    Peldaosztaly(int x1, int y1) {
        x = x1;
        y = y1;
        eredmeny = 0;
    }
    
    Peldaosztaly(Peldaosztaly obj){
        x = obj.x;
        y = obj.y;
        eredmeny = 0;
    }
    
    public void Muvelet(){
        eredmeny = x + y;
    }
    
    public void Kiir(){
        System.out.println(x + " + " + y + " = " + eredmeny);
    }
}

public class Konstruktor {


    public static void main(String[] args) {
        
        int szam1 = 8, szam2 = 7;
        
        //parameter nelkuli konstruktor hasznalata
        Peldaosztaly pelda1 = new Peldaosztaly();       //peldanyositas
        pelda1.Muvelet();
        pelda1.Kiir();
        
        //parameteres konstruktor
        Peldaosztaly pelda2 = new Peldaosztaly(szam1, szam2);
        pelda2.Muvelet();
        pelda2.Kiir();
        
        //masolo (copy) konstruktor
        Peldaosztaly pelda3 = new Peldaosztaly(pelda2);
        pelda3.Muvelet();
        pelda3.Kiir();
        
    }
    
}

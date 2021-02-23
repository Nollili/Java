package constr;

class PeldaOsztay {

    private int x, y, eredmeny;

    PeldaOsztay() {
        x = y = 1;
        eredmeny = 0;
    }

    PeldaOsztay(int x1, int y1) {
        x = x1;
        y = y1;
        eredmeny = 0;
    }

    PeldaOsztay(PeldaOsztay obj) {
        x = obj.x;
        y = obj.y;
        eredmeny = 0;
    }

    public void Muvelet() {
        eredmeny = x + y;

    }

    public void Kiir() {
        System.out.println(x + " + " + y + " = " + eredmeny);
    }
}

public class Constr {

    public static void main(String[] args) {
        int szam1 = 8, szam2 = 7;
        PeldaOsztay pelda1 = new PeldaOsztay();
        pelda1.Muvelet();
        pelda1.Kiir();

        PeldaOsztay pelda2 = new PeldaOsztay(szam1, szam2);
        pelda2.Muvelet();
        pelda2.Kiir();
        
        PeldaOsztay pelda3 = new PeldaOsztay(pelda1);
        pelda3.Muvelet();
        pelda3.Kiir();
        }

}

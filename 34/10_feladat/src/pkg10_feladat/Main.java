package pkg10_feladat;

import java.util.Scanner;

	class KarakterSzamOszt{
    private String s;
    private int karakterSzama, mhDb, szokDb, a_db, e_db, i_db, o_db, u_db;
    

    KarakterSzamOszt(int a_db, int e_db, int i_db, int o_db, int u_db, int mhDb, int szokDb){
        this.a_db = a_db;       
        this.e_db = e_db;
        this.i_db = i_db;
        this.o_db = o_db;
        this.u_db = u_db;
        this.mhDb = mhDb;
        this.szokDb = szokDb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Az on szovege : ");
        s = new String(sc.nextLine());
        s = s.toLowerCase();
        karakterSzama = s.length();
    }
    
    public void Vizsgalat(){
        for(int i = 0; i < karakterSzama; i++){
            switch(s.charAt(i)){
                case 'a':
                    mhDb++;
                    a_db++;
                    break;
                case 'e':
                    mhDb++;
                    e_db++;
                    break;
                case 'i':
                    mhDb++;
                    i_db++;
                    break;
                case 'o':
                    mhDb++;
                    o_db++;
                    break;
                case 'u':
                    mhDb++;
                    u_db++;
                    break;
                case ' ':
                    szokDb++;
                    break;
            }
        }
    }
    
    public void EredmenyKiir(){
        System.out.println("A megadott szoveg : ");
        System.out.println(s);
        System.out.println("Karakterek szama : " + karakterSzama);
        System.out.println("Maganhanzok szama : " + mhDb);
        System.out.println("\t\t'a' karakter szama : " + a_db);
        System.out.println("\t\t'e' karakter szama : " + e_db);
        System.out.println("\t\t'i' karakter szama : " + i_db);
        System.out.println("\t\t'o' karakter szama : " + o_db);
        System.out.println("\t\t'u' karakter szama : " + u_db);
        System.out.println("Szokozok szama : " + szokDb);
    }
}

public class Main {

    public static void main(String[] args) {
       
        KarakterSzamOszt karSzamOszt = new KarakterSzamOszt(0, 0, 0, 0, 0, 0, 0);
        karSzamOszt.Vizsgalat();
        karSzamOszt.EredmenyKiir();
        
    }
    
}

package operatorok;

public class Operatorok {

    public static void main(String[] args) {
        int a = 0 ,b, c, d;
        float e, f;
        b = 5;
        c = 3;
        
        //Aritmetikai operátorok, egyenlőség operátorok
        a = b + c;
        System.out.println(a);
        a = b - c;
        System.out.println(a);
        a = b * c;
        System.out.println(a);
        f = b;
        e = (float)(f / c);
        System.out.println(e);
        //rövidített forma
        a = a + 2;              //teljes forma
        System.out.println(a);
        a += 2;                 //rövidített forma ugyanaz mind a = a + 2
        System.out.println(a);
        a -= 2;
        a *= 2;
        a /= 2;
        a = b % c;
        System.out.println(a);
        //a = a % c;
        a %= c;
        System.out.println(a);
        
        
        //inkrementáló, dekrementáló operátorok
        a = 2;
        a = a - 1;
        //a++;
        //System.out.println(a--);
        System.out.println(a);
        //++a;
        System.out.println(++a);
        //--a;
        System.out.println(--a);
        
        
        //bitműveleti operácorok
        int i = 0;      //0000
        int j = 2;      //0010
        int k = i & j; //0000 & 0010 = 0000
        System.out.println(k);
        k = i | j;      //0000 | 0010 = 0010
         System.out.println(k);
        k = i ^ j;  //0000 ^ 0010 =  0010
        System.out.println(k);
        j = j << 2;     // 0010 << 2 = 1000
        //j <<=2;
        System.out.println(j);
        j = j >> 3;     //1000 >> 3 = 0001
        System.out.println(j);
        
        
        //relációs operátorok
        int l = 35;//20;
        int m = 35;
        boolean relacio = false;
        relacio = (l < m);
        System.out.println("l < m : " + relacio);
        relacio = (l == m);
        System.out.println("l == m : " + relacio);
        relacio = (l != m);
        System.out.println("l != m : " + relacio);
        relacio = (l >= m);
        System.out.println("l >= m : " + relacio);
        relacio = (l <= m);
        System.out.println("l <= m : " + relacio);
        
        
        //logikai operátorok
        boolean igaz = true;
        boolean hamis = false;
        boolean eredmeny;
        eredmeny = igaz && false;
        System.out.println("Logikai és : " + eredmeny);
        eredmeny = igaz || hamis;
        System.out.println("Logikai vagy : " + eredmeny);
        
        
        //feltételes operátor
        int q = 3;
        int z = 5;
        String v = (q > z) ? "q a nagyobb" : "z a nagyobb";
        System.out.println(v);
        //maximum kiválasztás
        int p = (q > z) ? 3 : 5;
        System.out.println(p);
        
        
        //precedencia szabály
        int prec = (5 + 4) * 8;
        System.out.println(prec);
        
        
        //asszociativitás szabály
        int n, w, u;
        n = w = u = 16;
        System.out.println("n = " + n + ", w = " + w + ", u = " + u);
        
    }
    void MaximumKivalasztas(int q, int z){
        int p = (q > z) ? 3 : 5;
        System.out.println(p);
    }
}

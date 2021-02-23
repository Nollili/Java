package kilencedikfeladat;

import java.util.Scanner;

class OsztalyozOsztaly {

    static int Osztályoz(int pontszam) {
        int erdemjegy = 0;
        if (pontszam > 0 && pontszam <= 100) {
            if (pontszam >= 90) {
                erdemjegy = 5;
            } else if (pontszam >= 70) {
                erdemjegy = 4;
            } else if (pontszam >= 60) {
                erdemjegy = 3;
            } else if (pontszam >= 50) {
                erdemjegy = 2;
            } else {
                erdemjegy = 1;
            }
        } else {
            System.out.println("Hibás adat került bevitelre!");
        }
        return erdemjegy;
    }

    static void SzovegesJegy(int jegy) {
        if (jegy >= 1 && jegy <= 100) {
            switch (jegy) {
                case 1:
                    System.out.println("Érdemjegy: elégtelen.");
                    break;
                case 2:
                    System.out.println("Érdemjegy: elégséges.");
                    break;
                case 3:
                    System.out.println("Érdemjegy: közepes.");
                    break;
                case 4:
                    System.out.println("Érdemjegy: jó.");
                    break;
                case 5:
                    System.out.println("Érdemjegy: jeles.");
                    break;
            }
        } else {
            System.out.println("Hibás adat került bevitelre!");
        }
    }
}

public class Kilencedikfeladat {

    public static void main(String[] args) {
        int pontszam = 0, erdemjegy = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("A dolgozat pontszáma: ");
            pontszam = sc.nextInt();
        } while (pontszam < 0 || pontszam > 100);
        sc.close();
        erdemjegy = OsztalyozOsztaly.Osztályoz(pontszam);
        OsztalyozOsztaly.SzovegesJegy(erdemjegy);
    }

}

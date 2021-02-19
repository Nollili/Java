
package pkg1_pelda;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Adjon meg egy egész számot, és megmondom osztható e 2-vel!");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        String szamString = be.readLine();
        int szam = Integer.parseInt(szamString);
        
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        if(szam % 2 == 0){
            System.out.println("A " + szam + " oszthato 2-vel!");
            return;
        }
        System.out.println("A " + szam + " nem osztható maradék nélkül 2-vel!");
        return;
    }
    
}

import java.io.Console;

public class hatodikfeladat {

        public static void main(String[] args) {


        System.out.println("Adjon meg egy szoveget, kiiratom betunkent!");

        Console cnsl = System.console();
        String s = cnsl.readLine();

        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            System.out.println(a);

        }
    }
}

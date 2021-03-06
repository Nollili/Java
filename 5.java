package arr;

public class Arr {

    public static void main(String[] args) {
        String[] cars = new String[4];

        cars[0] = "Mustang";
        cars[1] = "Camaro";
        cars[2] = "Bmw";
        cars[3] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[][] cats = new String[3][3];

        cats[0][0] = "Inky";
        cats[0][1] = "Twinky";
        cats[0][2] = "Blinky";

        cats[1][0] = "Stinky";
        cats[1][1] = "Linky";
        cats[1][2] = "Blindy";

        cats[2][0] = "Lily";
        cats[2][1] = "Twinsty";
        cats[2][2] = "Kinky";
        
        for(int i = 0; i < cats.length; i++){
            System.out.println();
            for(int j = 0; j < cats[i].length; j++){
                System.out.print(cats[i][j] + " ");
            }
        }
    }

}

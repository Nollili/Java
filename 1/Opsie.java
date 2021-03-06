package opsie;

public class Opsie {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        System.out.println(myCat.breed);
        System.out.println(myCat.name);
        System.out.println(myCat.color);
        myCat.purr();
        myCat.meow();
    }

}

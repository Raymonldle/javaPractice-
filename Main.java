public class Main{

    public static void printSlogan(String newSlogan){
        System.out.println(newSlogan);
    }


    public static void main(String[] args) {
        printSlogan("I have two cats");

        System.out.println();

        SuperHero hero = new SuperHero();

        hero.setAge(10);
        hero.setName("Alan");
        hero.setSuperPower("Flight");
        hero.setWeakness("Can only fly once every 392 days, 7 hours, 36 seconds, and 294 miliseconds");
    }
}
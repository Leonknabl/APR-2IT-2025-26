package k5;

public class Test {

    public static void main(String[] args) {

        Bruch b = new Bruch();
        b.nenner = 4;
        b.zaehler = 2;
        System.out.println("Zähler: " + b.zaehler);
        b.ausgeben();
        b.erweitern(2);
        b.ausgeben();
        b.erweitern(3);
        b.ausgeben();




    }
}

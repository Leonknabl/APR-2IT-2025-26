package k5;

public class Bruch {


    int zaehler = 1;
    int nenner = 1;

    //ausgeben
    public void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    //erweitern
    public void erweitern(int i) {
        zaehler = zaehler * i;
        nenner *= i;


    }
}
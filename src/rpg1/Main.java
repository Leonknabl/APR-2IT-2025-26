package rpg1;

public class Main {
    public static void main(String[] args) {
        Spieler s1 = new Spieler("Thomas", "Barbar");
        s1.zeichnen();

        s1.levelanstieg(true, true, false, false, false); // Angriff & Präzision +1
        s1.zeichnen();

        s1.levelanstieg(false, false, true, false, false); // Vitalität +2
        s1.zeichnen();
    }
}

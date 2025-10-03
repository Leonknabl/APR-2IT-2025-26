package rpg1;

public class Spieler {

    // Datenfelder
    private String name;
    private String klasse;
    private int level;

    private int angriff;
    private int praezision;
    private int vitalitaet;
    private int verteidigung;
    private int willenskraft;

    private int zauberenergie;
    private int lebensenergie;
    private int obergrenze;

    // Konstruktor
    public Spieler(String name, String klasse) {
        this.name = name;
        this.level = 1; // Start-Level
        this.obergrenze = 10; // Start-Obergrenze für Lebens- und Zauberenergie
        this.lebensenergie = obergrenze;
        this.zauberenergie = obergrenze;

        if (klasse.equals("Barbar")) {
            setEigenschaften(5, 3, 4, 2, 1);
        } else if (klasse.equals("Dämonenjäger")) {
            setEigenschaften(4, 3, 2, 2, 5);
        } else if (klasse.equals("Mönch")) {
            setEigenschaften(3, 4, 3, 5, 5);
        } else if (klasse.equals("Hexendoktor")) {
            setEigenschaften(5, 3, 2, 1, 5);
        } else if (klasse.equals("Zauberer")) {
            setEigenschaften(4, 4, 2, 2, 5);
        } else {
            this.klasse = "Wurm";
            return;
        }
        this.klasse = klasse;
    }

    // Hilfsmethode für Startwerte
    private void setEigenschaften(int angriff, int praezision, int vitalitaet, int verteidigung, int willenskraft) {
        this.angriff = angriff;
        this.praezision = praezision;
        this.vitalitaet = vitalitaet;
        this.verteidigung = verteidigung;
        this.willenskraft = willenskraft;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getKlasse() {
        return klasse;
    }

    public int getLevel() {
        return level;
    }

    public int getAngriff() {
        return angriff;
    }

    public int getPraezision() {
        return praezision;
    }

    public int getVitalitaet() {
        return vitalitaet;
    }

    public int getVerteidigung() {
        return verteidigung;
    }

    public int getWillenskraft() {
        return willenskraft;
    }

    public int getLebensenergie() {
        return lebensenergie;
    }

    public int getZauberenergie() {
        return zauberenergie;
    }

    public int getObergrenze() {
        return obergrenze;
    }

    // Erhöhen-Methoden
    public void erhoeheAngriff() {
        angriff++;
    }

    public void erhoehePraezision() {
        praezision++;
    }

    public void erhoeheVitalitaet() {
        vitalitaet++;
    }

    public void erhoeheVerteidigung() {
        verteidigung++;
    }

    public void erhoeheWillenskraft() {
        willenskraft++;
    }

    public void erhoeheLebensenergie() {
        if (lebensenergie < obergrenze)
            lebensenergie++;
    }

    public void erhoeheZauberenergie() {
        if (zauberenergie < obergrenze)
            zauberenergie++;
    }

    // Levelaufstieg
    public void levelanstieg(boolean angr, boolean praezi, boolean vitali, boolean verteidi, boolean willensk) {
        int gewaehlte = 0;
        if (angr) gewaehlte++;
        if (praezi) gewaehlte++;
        if (vitali) gewaehlte++;
        if (verteidi) gewaehlte++;
        if (willensk) gewaehlte++;

        if (gewaehlte == 2) {
            this.level++;
            if (angr) angriff++;
            if (praezi) praezision++;
            if (vitali) vitalitaet++;
            if (verteidi) verteidigung++;
            if (willensk) willenskraft++;
            this.obergrenze = (int) (obergrenze * 1.05); // +5%
            this.lebensenergie = obergrenze;
            this.zauberenergie = obergrenze;
        } else if (gewaehlte == 1) {
            this.level++;
            if (angr) angriff += 2;
            if (praezi) praezision += 2;
            if (vitali) vitalitaet += 2;
            if (verteidi) verteidigung += 2;
            if (willensk) willenskraft += 2;
            this.obergrenze = (int) (obergrenze * 1.05);
            this.lebensenergie = obergrenze;
            this.zauberenergie = obergrenze;
        }
    }

    // Ausgabe von Spieler
    public void zeichnen() {
        System.out.println("-------------------------------------------------");
        System.out.println("Name: " + name + " | Klasse: " + klasse + " | Level: " + level);
        System.out.println("Angriff: " + angriff + ", Präzision: " + praezision + ", Vitalität: " + vitalitaet);
        System.out.println("Verteidigung: " + verteidigung + ", Willenskraft: " + willenskraft);
        System.out.println("Lebensenergie: " + lebensenergie + "/" + obergrenze);
        System.out.println("Zauberenergie: " + zauberenergie + "/" + obergrenze);
        System.out.println("-------------------------------------------------");
    }
}

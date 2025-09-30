package rpg1;

public class Spieler {

        private String name;
        private String klasse;
        private int level;

        //Für Spieler
        private int angriff;
        private int praezision;
        private int vitalitaet;
        private int verteidigung;
        private int willenskaft;



        public Spieler(String name, String klasse) {
            this.name = name;
            //Barbar Dämonenjäger Mönch Hexendoktor Zauberer
            // this.klasse = klasse;

            if (klasse.equals("Barbar")) {
            setEigenschaften(5,3,4,2,1);


            }
        }

    private void setEigenschaften(int angriff, int praezision, int vitalitaet, int verteidigung, int willenskraft){}


}

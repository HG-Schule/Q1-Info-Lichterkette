package de.hufeisen_games.repo.q1_info_amt;

public class Led {

    private boolean leuchtet = false;

    public void lichtAn() {
        leuchtet = true; // schaltet Licht ein :D
    }

    public void lichtAus() {
        leuchtet = false; // schaltet Licht aus :D
    }

    public void setLeuchtet(boolean leuchtet) {
        this.leuchtet = leuchtet; // schnelle Variante für die die beiden methoden oben xD
    }

    public boolean isLeuchtet() {
        return leuchtet; // Ersetzt deine Augen °.|.°
    }
}

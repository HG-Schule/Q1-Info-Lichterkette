package de.hufeisen_games.repo.q1_info_amt;

public class Steuerung {

    private int anzahlLeds;
    private List<Led> lichterkette;

    public Steuerung() {
        this.lichterkette = new List<>();
    }

    public void leuchten1(){

        //TODO

    }
    public void leuchten2(){

        //TODO

    }
    public void leuchten3(){

        //TODO

    }

    public int getAnzahlLeds() {
        return anzahlLeds;
    }

    public void lichterketteAnhaengen(List<Led> pLichterkette){

        this.lichterkette.concat(pLichterkette);

    }
}

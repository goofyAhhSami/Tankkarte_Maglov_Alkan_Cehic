package Tankstelle;

import java.time.LocalDateTime;

public class Tankung {
    private int tNr;
    private String pan;
    private int pID;
    private int tsNr;
    private double Menge;
    private double preisProEinheit;
    private double gesamtpreis;
    private LocalDateTime tDatum;
    private boolean abgerechnet;

    public Tankung(int tNr, String pan, int pID, int tsNr, double menge, double preisProEinheit, double gesamtpreis, LocalDateTime tDatum, boolean abgerechnet) {
        this.tNr = tNr;
        this.pan = pan;
        this.pID = pID;
        this.tsNr = tsNr;
        Menge = menge;
        this.preisProEinheit = preisProEinheit;
        this.gesamtpreis = gesamtpreis;
        this.tDatum = tDatum;
        this.abgerechnet = abgerechnet;
    }

    @Override
    public String toString() {
        return "Tankung{" +
                "tNr=" + tNr +
                ", pan='" + pan + '\'' +
                ", pID=" + pID +
                ", tsNr=" + tsNr +
                ", Menge=" + Menge +
                ", preisProEinheit=" + preisProEinheit +
                ", gesamtpreis=" + gesamtpreis +
                ", tDatum=" + tDatum +
                ", abgerechnet=" + abgerechnet +
                '}';
    }
}

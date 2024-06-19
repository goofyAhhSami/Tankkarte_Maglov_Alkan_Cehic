package Tankstelle;
public class Rabattcode {
   private int rcNr;
   private double preisProEinheit;
   private int rabattInCent;
   private int pID;

    public Rabattcode(int rcNr, double preisProEinheit, int rabattInCent, int pID) {
        this.rcNr = rcNr;
        this.preisProEinheit = preisProEinheit;
        this.rabattInCent = rabattInCent;
        this.pID = pID;
    }

    @Override
    public String toString() {
        return "Rabattcode{" +
                "rcNr=" + rcNr +
                ", preisProEinheit=" + preisProEinheit +
                ", rabattInCent=" + rabattInCent +
                ", pID=" + pID +
                '}';
    }
}

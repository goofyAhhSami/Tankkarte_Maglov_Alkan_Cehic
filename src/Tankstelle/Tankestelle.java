package Tankstelle;

public class Tankestelle {
    private int tsNr;
    private String tsName;

    public Tankestelle(int tsNr, String tsName) {
        this.tsNr = tsNr;
        this.tsName = tsName;
    }

    @Override
    public String toString() {
        return "Tankestelle{" +
                "tsNr=" + tsNr +
                ", tsName='" + tsName + '\'' +
                '}';
    }
}

package Tankstelle;

public class Produkt {
    private int pID;
    private String produkname;
    private String beschreibung;
    private String einheit;

    public Produkt(int pID, String produkname, String beschreibung, String einheit) {
        this.pID = pID;
        this.produkname = produkname;
        this.beschreibung = beschreibung;
        this.einheit = einheit;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "pID=" + pID +
                ", produkname='" + produkname + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", einheit='" + einheit + '\'' +
                '}';
    }
}

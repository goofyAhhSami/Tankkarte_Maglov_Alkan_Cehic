package Tankstelle;

import java.sql.Date;

public class Tankkarte {
    private int pan;
    private String ausgestelltAuf;
    private Date gueltigBis;
    private int kNr;
    private Date ausstellungsdatum;
    private boolean status;
    private double kartenlimit;

    public Tankkarte(int pan, String ausgestelltAuf, Date gueltigBis, int kNr, Date ausstellungsdatum, boolean status, double kartenlimit) {
        this.pan = pan;
        this.ausgestelltAuf = ausgestelltAuf;
        this.gueltigBis = gueltigBis;
        this.kNr = kNr;
        this.ausstellungsdatum = ausstellungsdatum;
        this.status = status;
        this.kartenlimit = kartenlimit;
    }

    @Override
    public String toString() {
        return "Tankkarte{" +
                "pan=" + pan +
                ", ausgestelltAuf='" + ausgestelltAuf + '\'' +
                ", gueltigBis=" + gueltigBis +
                ", kNr=" + kNr +
                ", ausstellungsdatum=" + ausstellungsdatum +
                ", status=" + status +
                ", kartenlimit=" + kartenlimit +
                '}';
    }
}

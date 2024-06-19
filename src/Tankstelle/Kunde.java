package Tankstelle;

public class Kunde {
    private int kNr;
    private String firmenname;
    private boolean status;
    private int kundenLimit;

    public Kunde(int kNr, String firmenname, boolean status, int kundenLimit) {
        this.kNr = kNr;
        this.firmenname = firmenname;
        this.status = status;
        this.kundenLimit = kundenLimit;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kNr=" + kNr +
                ", firmenname='" + firmenname + '\'' +
                ", status=" + status +
                ", kundenLimit=" + kundenLimit +
                '}';
    }
}

import java.io.Serializable;

/**
 * Created by christerhansen on 09.12.15.
 */
public class Kjoretoy implements Serializable {
    String regNr;
    String effekt;
    int antHjul;

    public Kjoretoy(String regNr, String effekt, int antHjul) {
        this.regNr = regNr;
        this.effekt = effekt;
        this.antHjul = antHjul;
    }

    public Kjoretoy(){}

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getEffekt() {
        return effekt;
    }

    public void setEffekt(String effekt) {
        this.effekt = effekt;
    }

    public int getAntHjul() {
        return antHjul;
    }

    public void setAntHjul(int antHjul) {
        this.antHjul = antHjul;
    }
}

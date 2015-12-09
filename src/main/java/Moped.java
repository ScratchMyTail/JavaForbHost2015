/**
 * Created by christerhansen on 09.12.15.
 */
public class Moped extends Kjoretoy{
    int antCylinder;

    public Moped(String regNr, String effekt, int antHjul, int antCylinder) {
        super(regNr, effekt, antHjul);
        this.antCylinder = antCylinder;
    }

    public int getAntCylinder() {
        return antCylinder;
    }

    public void setAntCylinder(int antCylinder) {
        this.antCylinder = antCylinder;
    }
}

import java.io.Serializable;

/**
 * Created by christerhansen on 09.12.15.
 */
public class Bil extends Kjoretoy implements Serializable{
    int antDorer;

    public Bil(String regNr, String effekt, int antHjul, int antDorer) {
        super(regNr, effekt, antHjul);
        this.antDorer = antDorer;
    }

    public Bil(){
        super();
    }

    public int getAntDorer() {
        return antDorer;
    }

    public void setAntDorer(int antDorer) {
        this.antDorer = antDorer;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "antDorer=" + antDorer +
                '}';
    }
}

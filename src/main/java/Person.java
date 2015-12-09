/**
 * Created by christerhansen on 09.12.15.
 */
public class Person {
    private String fornavn = "christer";
    private String etternavn;
    private int alder;

    public Person(){}

    public Person(String fornavn, String etternavn, int alder){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", alder=" + alder +
                '}';
    }
}

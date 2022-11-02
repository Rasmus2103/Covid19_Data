import java.util.Date;

public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private String bekræftedeDøde;
    private String døde;
    private String indlagtePaaIntensiv;
    private String indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, String bekræftedeDøde, String døde, String indlagtePaaIntensiv, String indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeDøde = bekræftedeDøde;
        this.døde = døde;
        this.indlagtePaaIntensiv = indlagtePaaIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public String getBekræftedeDøde() {
        return bekræftedeDøde;
    }

    public String getDøde() {
        return døde;
    }

    public String getIndlagtePaaIntensiv() {
        return indlagtePaaIntensiv;
    }

    public String getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

}

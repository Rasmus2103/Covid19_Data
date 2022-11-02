public class Covid19Data {
    private String region;
    private int aldersgruppe;
    private String bekræftedeDøde;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, int aldersgruppe, String bekræftedeDøde, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeDøde = bekræftedeDøde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


}

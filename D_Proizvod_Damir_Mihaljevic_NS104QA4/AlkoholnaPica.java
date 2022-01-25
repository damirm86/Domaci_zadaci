package Vezba;

public class AlkoholnaPica extends Pice {
    private double procenatAlkohola;

    public AlkoholnaPica(String barKod, String naziv, double cena, String amabalaza, double procenatAlkohola) {
        super(barKod, naziv, cena, amabalaza);
        this.procenatAlkohola = procenatAlkohola;
    }

    public double getProcenatAlkohola() {
        return procenatAlkohola;
    }

    public void setProcenatAlkohola(double procenatAlkohola) {
        this.procenatAlkohola = procenatAlkohola;
    }

}

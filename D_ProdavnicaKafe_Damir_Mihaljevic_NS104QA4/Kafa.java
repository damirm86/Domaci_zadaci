public class Kafa {
    private String naziv;
    private int velicina;
    private String [] sastojci;
    private double cena ;

    public Kafa(String naziv, int velicina, String[] sastojci, int cena) {
        this.naziv = naziv;
        this.velicina = velicina;
        this.sastojci = sastojci;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getVelicina() {
        return velicina;
    }

    public void setVelicina(int velicina) {
        this.velicina = velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void obracunajPopust(int procenat){
        double popust=(this.cena*procenat)/100;
        this.cena=this.cena-popust;
    }

    public String toString()
    {
        return naziv + " - cena : " + cena;
    }

}

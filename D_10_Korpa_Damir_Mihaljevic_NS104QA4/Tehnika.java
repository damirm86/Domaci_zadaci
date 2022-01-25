package Vezba;

public class Tehnika extends Proizvod {
    private int garancija;
    private int tezina;
    private int kolicina;

    public Tehnika(String barKod, String naziv, double cena, int garancija, int tezina) {
        super(barKod, naziv, cena);
        this.garancija = garancija;
        this.tezina = tezina;
    }

    public int getGarancija() {
        return garancija;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public void poruci(int kolicina){
        if(tezina>30)
        System.out.print("Dostava do vrata! ");
        System.out.println("Vas racun je :" +getCena()*kolicina);
    }

}

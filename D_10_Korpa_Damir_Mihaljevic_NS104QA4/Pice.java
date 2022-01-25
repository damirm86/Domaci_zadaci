package Vezba;

public class Pice extends Proizvod {
    private String amabalaza;
    private int kolicina;

    public Pice(String barKod, String naziv, double cena, String amabalaza) {
        super(barKod, naziv, cena);
        this.amabalaza = amabalaza;
    }

    public String getAmabalaza() {
        return amabalaza;
    }

    public void setAmabalaza(String amabalaza) {
        this.amabalaza = amabalaza;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public void poruci(int kolicina){
        if(getAmabalaza().equals("kartonska"))
            System.out.println("Vas racun je : " + (getCena() + getCena()*10/100 )* kolicina);
        else if(getAmabalaza().equals("plasticna"))
            System.out.println("Vas racun je : " + (getCena() + getCena()*20/100 )* kolicina);
        else
            System.out.println("Vas racun je : " + (getCena() + getCena()*30/100 )* kolicina);
    }


}


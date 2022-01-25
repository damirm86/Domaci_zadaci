package Vezba;

import java.time.LocalDate;

public class Prehrambeni extends Proizvod {
    private LocalDate datumIsteka;
    private LocalDate now = LocalDate.now();
    private int kolicina;

    public Prehrambeni(String barKod, String naziv, double cena, LocalDate datumIsteka) {
        super(barKod, naziv, cena);
        this.datumIsteka = datumIsteka;
    }

    public LocalDate getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(LocalDate datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public void poruci(int kolicina){
        if(datumIsteka.getYear()<now.getYear())
            System.out.println("Datum istekao!!!");
            else if(datumIsteka.getYear()==now.getYear() && datumIsteka.getMonthValue()<now.getMonthValue())
            System.out.println("Datum istekao!!!");
            else if(datumIsteka.getMonthValue()==now.getMonthValue() && datumIsteka.getDayOfYear()<now.getDayOfYear())
            System.out.println("Datum istekao!!!");
            else System.out.println("Vas racun je :" +getCena()*kolicina);
    }

}

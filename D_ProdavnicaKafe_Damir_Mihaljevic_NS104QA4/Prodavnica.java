public class Prodavnica {

    private Kafa[] kafa;
    private String adresa;
    private static int brojProdavnica;
    private int brojKupljenihProizvoda;

    public Prodavnica(Kafa[] kafa, String adresa) {
        this.kafa = kafa;
        this.adresa = adresa;
        brojProdavnica++;
        this.brojKupljenihProizvoda=0;
    }

    public Kafa[] getKafa() {
        return kafa;
    }

    public String getAdresa() {
        return adresa;
    }

    public static int getBrojProdavnica() {
        return brojProdavnica;
    }

    public String toString()
    {
        return "Najuspesnija je prodavnica na adresi " + adresa;
    }


    public int getBrojKupljenihProizvoda() {
        return brojKupljenihProizvoda;
    }

    public void setKafa(Kafa[] kafa) {
        this.kafa = kafa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setBrojProdavnica(int brojProdavnica) {
        this.brojProdavnica = brojProdavnica;
    }

    public void setBrojKupljenihProizvoda(int brojKupljenihProizvoda) {
        this.brojKupljenihProizvoda = brojKupljenihProizvoda;
    }

    public void kupiKafu(Kafa kafa, int kolicina) {
        double racun = kafa.getCena() * kolicina;
        brojKupljenihProizvoda += kolicina;
        System.out.println("Racun je: " + racun);
    }

    public void popust(int popust) {
        for (Kafa kafa : kafa) {
            kafa.obracunajPopust(popust);
        }
    }

    public static Prodavnica najuspesnijaProdavnica(Prodavnica[] prodavnica)
    {
        Prodavnica najuspesnija = prodavnica[0];
        int najveciBroj = prodavnica[0].brojKupljenihProizvoda;

        for (int i = 1; i < prodavnica.length; i++)
        {
            if (prodavnica[i].brojKupljenihProizvoda > najveciBroj)
            {
                najveciBroj = prodavnica[i].brojKupljenihProizvoda;
                najuspesnija = prodavnica[i];
            }
        }

        return najuspesnija;
    }

    public void stampajKafeuProdavnici(Prodavnica prodavnica){

        for (Kafa k : prodavnica.getKafa()) {
            System.out.println(k.toString());
        }
    }



}

package Vezba;

import java.util.HashMap;

public class Korpa
{
    private Kupac kupac;
    private HashMap<Proizvod,Integer> proizvodi;

    public Korpa(Kupac kupac)
    {
        proizvodi = new HashMap<>();
        this.kupac = kupac;
    }

    public Kupac getKupac()
    {
        return kupac;
    }

    public void setKupac(Kupac kupac)
    {
        this.kupac = kupac;
    }

    public HashMap<Proizvod, Integer> getProizvodi()
    {
        return proizvodi;
    }

    public void addProizvod(Proizvod proizvod)
    {
        proizvodi.put(proizvod, proizvodi.getOrDefault(proizvod, 0) + 1);
    }

    public void ispisiRacun()
    {
        System.out.println("Korpa kupca: "+kupac.getIme() + " " + kupac.getPrezime());
        System.out.println(" Naziv   |   Kolicina    |   Cena");
        System.out.println("----------------------------------");

        double suma=0;
        for (Proizvod p: proizvodi.keySet())
        {
            String s = " ";

            s+= p.getNaziv() + "      x" + proizvodi.get(p) + "       "  + p.getCena() * proizvodi.get(p);
            System.out.println(s);
            suma+=p.getCena()*proizvodi.get(p);
        }
        System.out.println("----------------------------------");
        System.out.println("Za uplatu: " + suma);

    }
}
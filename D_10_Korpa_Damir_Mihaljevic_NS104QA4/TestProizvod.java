package Vezba;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestProizvod
{
    public static void main(String[] args)
    {
        Korpa(kreirajKorpu(), listaProizvoda());
    }

    private static Korpa kreirajKorpu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi ime kupca: ");
        String ime = scanner.next();

        System.out.print("Unesi prezime kupca: ");
        String prezime = scanner.next();
        System.out.println();

        return new Korpa(new Kupac(ime,prezime));
    }

    private static LinkedList<Proizvod> listaProizvoda()
    {
        Proizvod p1 = new Prehrambeni("475sdi7","mleko",100, LocalDate.of(2021,12,30));
        Proizvod p2 = new Tehnika("345kh3","sporet",35000,5,40);
        Proizvod p3 = new AlkoholnaPica("654k33","pivo",120,"staklena",10);
        Proizvod p4 = new Pice("774gg","sok breskva",200,"kartonska");

        LinkedList<Proizvod> proizvodi = new LinkedList<>();
        proizvodi.add(p1);
        proizvodi.add(p2);
        proizvodi.add(p3);
        proizvodi.add(p4);

        return proizvodi;
    }

    private static void Korpa(Korpa korpa, List<Proizvod> proizvodi)
    {
        Scanner scanner = new Scanner(System.in);
        String barKod = "";

        while (!barKod.equals("kraj"))
        {
            System.out.println("Unesite barkod proizvoda (Za kraj kupovine unesite -kraj- ) : ");
            barKod = scanner.next();
            System.out.println();

            Boolean postoji = false;

            for (Proizvod p: proizvodi)
            {
                if(p.getBarKod().equals(barKod)) {
                    korpa.addProizvod(p);
                    postoji = true;
                    break;
                }
            }
            if(barKod.equals("kraj")) {
                System.out.println("Kraj kupovine!");
            }
            else if(postoji == true) {
                System.out.println("Proizvod je ubacen u korpu!");
            }
            else {
                System.out.println("Proizvod ne postoji!");
            }
        }
        korpa.ispisiRacun();
    }
}

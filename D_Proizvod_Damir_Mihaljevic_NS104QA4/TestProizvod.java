package Vezba;

import java.time.LocalDate;

public class TestProizvod {
    public static void main(String[] args) {
        Proizvod p1 = new Prehrambeni("475sdi7","mleko",100, LocalDate.of(2021,12,30));
        Proizvod p2 = new Tehnika("345kh3","sporet",35000,5,40);
        Proizvod p3 = new AlkoholnaPica("654k33","pivo",120,"staklena",10);
        Proizvod p4 = new Pice("774gg","sok breskva",200,"kartonska");

        Proizvod [] proizvodi={p1,p2,p3,p4};

        System.out.println("Svakom proizvodu skupljem od 200 din dodati popust od 15 %");
        for (Proizvod p: proizvodi) {
            if(p.getCena()>200) {
                p.setPopust(20);
                System.out.println(p);
            }
        }

        System.out.println("Svakom proizvodu koji je alkoholno pice dodati jos popust od 50%");
        for (Proizvod i: proizvodi) {
            if(i instanceof AlkoholnaPica){
                i.setPopust(50);
                System.out.println(i);
            }
        }

        System.out.println("Ispisati sve proizvode (proveriti da li se cena dobro promenila)");
        for (Proizvod i:proizvodi) {
            System.out.println(i);
        }

        System.out.println("Poruciti svaki proizvod iz niza");

        for (Proizvod i: proizvodi) {
            i.poruci(1);
        }
    }
}

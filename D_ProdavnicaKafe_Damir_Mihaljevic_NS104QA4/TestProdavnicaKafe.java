
import java.util.Arrays;

public class TestProdavnicaKafe {
    public static void main(String[] args) {

        Kafa kafa1 = new Kafa("Espresso Intenso", 50, new String[]{"arabica", "robusta"}, 150);
        Kafa kafa2 = new Kafa("Cappuccino", 220, new String[]{"kafa", "mleko", "secer"}, 190);
        Kafa kafa3 = new Kafa("Flat White", 180, new String[]{"mleko", "arabika", "karamel"}, 200);

        Kafa[] nizKafa1 = {kafa1, kafa2, kafa3};
        Kafa[] nizKafa2 = {kafa2, kafa3};

        Prodavnica prodavnica1 = new Prodavnica(nizKafa1, "Cankareva 1");
        Prodavnica prodavnica2 = new Prodavnica(nizKafa2, "Modene 2");


        System.out.println("------Ponuda kafa u prodavnici 1------");
        prodavnica1.stampajKafeuProdavnici(prodavnica1);
        System.out.println("------Ponuda kafa u prodavnici 2------");
        prodavnica2.stampajKafeuProdavnici(prodavnica2);

        System.out.println();

        System.out.println("Broj prodavnica je:" + Prodavnica.getBrojProdavnica());

        prodavnica1.kupiKafu(kafa1, 2);
        prodavnica2.kupiKafu(kafa2, 1);
        prodavnica2.kupiKafu(kafa3, 3);
        System.out.println("Broj kupljenih proizvoda u prodavnici 1 je: " + prodavnica1.getBrojKupljenihProizvoda());
        System.out.println("Broj kupljenih proizvoda u prodavnici 2 je: " + prodavnica2.getBrojKupljenihProizvoda());


        Prodavnica najuspesnija = Prodavnica.najuspesnijaProdavnica(new Prodavnica[]{prodavnica1, prodavnica2});
        System.out.println(najuspesnija.toString());

        najuspesnija.popust(20);

        System.out.println("Cena kafa u najuspesnijoj prodavnici sa popustom su:");

        najuspesnija.stampajKafeuProdavnici(najuspesnija);

    }

}
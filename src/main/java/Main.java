import composants.*;
import decorateurs.*;

public class Main {
    public static void main(String[] args) {

        Boisson b1 = new Deca();
        afficher(b1);

        Boisson b2 = new Chocolat(b1);
        afficher(b2);

        Boisson b3 = new Chocolat(new Chocolat(new Deca()));
        afficher(b3);

        Boisson b4 = new Caramel(new Lait(new Sumatra()));
        afficher(b4);

        Boisson b5 = new Lait(new Caramel(new Chocolat(new Deca())));
        afficher(b5);
    }

    private static void afficher(Boisson b) {
        System.out.printf("%-35s : %.2f DH%n", b.getDescription(), b.cout());
    }
}
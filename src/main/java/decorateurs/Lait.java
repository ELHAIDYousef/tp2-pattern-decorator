package decorateurs;

import composants.Boisson;

public class Lait extends Decorateur {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Au lait";
    }
}
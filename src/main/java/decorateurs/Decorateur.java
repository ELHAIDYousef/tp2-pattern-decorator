package decorateurs;

import composants.*;

public abstract class Decorateur extends Boisson{
    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public abstract String getDescription();
}

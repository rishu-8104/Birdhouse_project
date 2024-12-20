package fi.tamk.fauna23.ducks;

import org.codehouse.lib.fly.FlyWithWings;
import org.codehouse.lib.quack.Quack;

public class Redhead extends Duck {
    public Redhead() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}
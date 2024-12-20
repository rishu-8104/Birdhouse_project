package fi.tamk.fauna23.ducks;

import org.codehouse.lib.fly.FlyNoWay;
import org.codehouse.lib.quack.*;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
package fi.tamk.fauna23.ducks;

import org.codehouse.lib.fly.FlyBehavior;
import org.codehouse.lib.quack.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private String name;
    public Duck() {
        // Constructor
    }
    public void performFly() {
        flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
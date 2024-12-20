package fi.tamk.fauna23.birdhouse;

import fi.tamk.fauna23.ducks.Duck;
import fi.tamk.fauna23.ducks.Mallard;
import fi.tamk.fauna23.ducks.RubberDuck;

import java.util.ArrayList;

public class BirdHouse {

    private ArrayList<Duck> duckflock = new ArrayList<Duck>();

    public void addMallardDuck(String name){
        Duck duck = new Mallard();
        duck.setName(name);
        duckflock.add(duck);
    }

    public void addRubberDuck(String name){
        Duck duck = new RubberDuck();
        duck.setName(name);
        duckflock.add(duck);
    }
    public void bigNoise(){
        for(Duck d :duckflock){
            System.out.println("Duck " + d.getName() + " is quacking like this: " + d.performQuack());
        }

    }


}

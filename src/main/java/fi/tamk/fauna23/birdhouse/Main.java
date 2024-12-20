package fi.tamk.fauna23.birdhouse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BirdHouse birdhouse = new BirdHouse();
        birdhouse.addMallardDuck("Tom");
        birdhouse.addMallardDuck("JIll");

        birdhouse.addRubberDuck("Rubber");


        birdhouse.bigNoise();
    }
}
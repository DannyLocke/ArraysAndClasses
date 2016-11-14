package com.ironyard;

public class Main {

    public static void main(String[] args) {
        Burrito x = new Burrito();
        x.meat = "pork";
        System.out.println(x.meat);

        Car y = new Car();
        y.isRunning = true;
        System.out.println(y.isRunning);

        Dog d = new Dog();
        d.breed = "pointer";
        System.out.println(d.breed);

        House h = new House();
        h.bedRooms = 2;
        System.out.println(h.bedRooms);

        Superhero s = new Superhero();
        s.power = "flying";
        System.out.println(s.power);

    }
}

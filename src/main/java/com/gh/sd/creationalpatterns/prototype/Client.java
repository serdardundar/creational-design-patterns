package com.gh.sd.creationalpatterns.prototype;

import lombok.SneakyThrows;

public class Client {

    @SneakyThrows
    public static void main(String[] args) {
        Swordsman sm1 = new Swordsman();
        sm1.move(new Point3D(-10, 0, 0), 20);
        sm1.attack();
        System.out.println(sm1);

        Swordsman sm2 = (Swordsman) sm1.clone();
        System.out.println("Cloned " + sm2);

        General g1 = new General();
        System.out.println(g1);

        // should throw CloneNotSupportedException
        General g2 = (General) g1.clone();
        System.out.println(g2);
    }
}

package com.cybertek.tests;

import com.github.javafaker.Faker;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("I will try all by best to learn this class");

        Faker faker=new Faker();

        System.out.println(faker.name().fullName());

        System.out.println(faker.chuckNorris().fact());

    }
}

package com.testdev.interview.dp.gof.creational.factory.method.main;

import com.testdev.interview.dp.gof.creational.factory.method.creators.ArchersCreator;
import com.testdev.interview.dp.gof.creational.factory.method.creators.CavalryCreator;
import com.testdev.interview.dp.gof.creational.factory.method.creators.Creator;
import com.testdev.interview.dp.gof.creational.factory.method.creators.InfantryCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates objects without specifying the exact class of object that will be created.
 * Creates an instance of several derived classes
 * Created by oleh.krupenia on 7/1/2015.
 */
public class FactoryMethodApp {
    public static void main(String[] args) {
        List<Creator> creators = new ArrayList<>();
        creators.add(new ArchersCreator());
        creators.add(new InfantryCreator());
        creators.add(new CavalryCreator());

        for (Creator creator : creators) {
            creator.createWarrior().info();
        }
    }
}

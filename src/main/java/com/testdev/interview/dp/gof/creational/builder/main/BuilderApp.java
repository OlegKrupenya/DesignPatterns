package com.testdev.interview.dp.gof.creational.builder.main;

import com.testdev.interview.dp.gof.creational.builder.creator.CarthaginianBuilder;
import com.testdev.interview.dp.gof.creational.builder.creator.Director;
import com.testdev.interview.dp.gof.creational.builder.creator.RomanBuilder;
import com.testdev.interview.dp.gof.creational.builder.domain.Army;

/**
 * Separates object construction from its representation
 * Created by oleh.krupenia on 7/1/2015.
 */
public class BuilderApp {
    public static void main(String[] args) {
        Director director = new Director();
        Army army1 = director.createArmy(new RomanBuilder());
        army1.info();
        Army army2 = director.createArmy(new CarthaginianBuilder());
        army2.info();
    }
}

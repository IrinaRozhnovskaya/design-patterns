package com.javarush.task3702;

import com.javarush.task3702.female.FemaleFactory;
import com.javarush.task3702.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType {MALE, FEMALE}

    public static AbstractFactory getFactory(HumanFactoryType sex) {
        if (sex.equals(HumanFactoryType.MALE))
            return new MaleFactory();
            else
            return new FemaleFactory();
    }
}
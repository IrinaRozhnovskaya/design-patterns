package com.javarush.task3702.female;

import com.javarush.task3702.AbstractFactory;
import com.javarush.task3702.Human;

public class FemaleFactory implements AbstractFactory{

        public Human getPerson(int age) {
            if (age <= KidGirl.MAX_AGE)
                return new KidGirl();
            else
            if (age > KidGirl.MAX_AGE & age <= TeenGirl.MAX_AGE )
                return new TeenGirl();
            else return new Woman();

        }
    }
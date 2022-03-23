package org.example;

import java.util.Objects;

public class DiffblueEngineering {
    public boolean doSomethingAwesome(String theThing, int howManyTimes) throws EngineeringException {
        Objects.requireNonNull(theThing, "Awesome thing was null");

        if (howManyTimes == 0) {
            throw new EngineeringException("Nothing awesome");
        }
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println(theThing);
        }
        if (theThing.equals("ReleaseProduct")) {
            Picard.makeItSo();
            return true;
        }
        return false;
    }

    public boolean doSomethingAwesomeOnce(String theThing) throws EngineeringException {
        if (theThing == null) {
            throw new EngineeringException("Nothing awesome");
        }
        if (theThing.equals("ReleaseProduct")) {
            Picard.makeItSo();
            return true;
        }
        return false;
    }
}

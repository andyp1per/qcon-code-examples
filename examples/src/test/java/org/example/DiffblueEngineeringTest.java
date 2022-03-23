package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DiffblueEngineeringTest {

    @Test
    void testDoSomethingAwesome() throws EngineeringException {
        // Arrange
        DiffblueEngineering diffblueEngineering = new DiffblueEngineering();
        String theThing = "The Thing";
        int howManyTimes = 1;

        // Act and Assert
        assertFalse(diffblueEngineering.doSomethingAwesome(theThing, howManyTimes));
    }

    @Test
    void testDoSomethingAwesome2() throws EngineeringException {
        // Arrange
        DiffblueEngineering diffblueEngineering = new DiffblueEngineering();
        String theThing = "ReleaseProduct";
        int howManyTimes = 1;

        // Act and Assert
        assertTrue(diffblueEngineering.doSomethingAwesome(theThing, howManyTimes));
    }

    @Test
    void testDoSomethingAwesome3() throws EngineeringException {
        // Arrange
        DiffblueEngineering diffblueEngineering = new DiffblueEngineering();
        String theThing = "The Thing";
        int howManyTimes = 0;

        // Act and Assert
        assertThrows(EngineeringException.class, () -> diffblueEngineering.doSomethingAwesome(theThing, howManyTimes));
    }

    @Test
    void testDoSomethingAwesomeOnce() throws EngineeringException {
        // Arrange
        DiffblueEngineering diffblueEngineering = new DiffblueEngineering();
        String theThing = "The Thing";

        // Act and Assert
        assertFalse(diffblueEngineering.doSomethingAwesomeOnce(theThing));
    }

    @Test
    void testDoSomethingAwesomeOnce2() throws EngineeringException {
        // Arrange
        DiffblueEngineering diffblueEngineering = new DiffblueEngineering();
        String theThing = "ReleaseProduct";

        // Act and Assert
        assertTrue(diffblueEngineering.doSomethingAwesomeOnce(theThing));
    }

    @Test
    void testDoSomethingAwesomeOnce3() throws EngineeringException {
        // Arrange
        DiffblueEngineering diffblueEngineering = new DiffblueEngineering();
        String theThing = null;

        // Act and Assert
        assertThrows(EngineeringException.class, () -> diffblueEngineering.doSomethingAwesomeOnce(theThing));
    }

}


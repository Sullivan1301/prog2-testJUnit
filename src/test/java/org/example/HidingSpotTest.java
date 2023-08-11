package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HidingSpotTest {
    @Test
    public void testCanReachHidingSpotInTime() {
        assertTrue(HidingSpot.isHidingAnOption("X..C....A.."));
    }

    @Test
    public void testCannotReachHidingSpotInTime() {
        assertFalse(HidingSpot.isHidingAnOption("X...C..A"));
    }

    @Test
    public void testCannotReachAnyHidingSpotInTime() {
        assertFalse(HidingSpot.isHidingAnOption("X....A.C.....C.C"));
    }

    @Test
    public void testNoHidingSpot() {
        assertFalse(HidingSpot.isHidingAnOption("X...A"));
    }

    @Test
    public void testHidingSpotExactlyAtYourPosition() {
        assertFalse(HidingSpot.isHidingAnOption("X.CA"));
    }

    @Test
    public void testHidingSpotExactlyAtAnimalPosition() {
        assertFalse(HidingSpot.isHidingAnOption("XAC."));
    }

    @Test
    public void testAnimalCloserToHidingSpot() {
        assertFalse(HidingSpot.isHidingAnOption("X..C.A.C."));
    }

    @Test
    public void testHidingSpotAfterAnimal() {
        assertFalse(HidingSpot.isHidingAnOption("X..CA"));
    }

    @Test
    public void testMultipleHidingSpotsOneReachable() {
        assertTrue(HidingSpot.isHidingAnOption("X.C.AC."));
    }

    @Test
    public void testLongPathWithAnimalBehind() {
        assertFalse(HidingSpot.isHidingAnOption("X....A..C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C"));
    }
}
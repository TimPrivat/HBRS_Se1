package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertEquals(value, "Übersetzung der Zahl 0 nicht möglich [1.0]");
    }

    @Test
    void inRange() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);
        assertEquals(value, "eins");
    }

    @Test
    void aboveRange() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(100);
        assertEquals(value, "Übersetzung der Zahl 100 nicht möglich [1.0]");
    }

    @Test
    void belowRange() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertNotEquals(value, "eins");
    }
    @Test
    void aNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);
        assertNotEquals(value, "zwei");
    }

    @Test
    void aNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(1);
        assertNotEquals(value, "zwei");
    }



}
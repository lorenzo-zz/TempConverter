/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTest {
    @Test void toIntTest(){
        Conversor cv = new Conversor();
        assertEquals(55.400000000000006,cv.toFahrenheit(13));
    }
}

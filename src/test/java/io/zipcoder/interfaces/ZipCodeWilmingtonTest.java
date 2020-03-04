package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    Educator nobles = Educator.nobles;
    ZipCodeWilmington zip = new ZipCodeWilmington();

    @Test
    public void testHostLecture1() {
    zip.hostLecture(nobles,1);
    }
}
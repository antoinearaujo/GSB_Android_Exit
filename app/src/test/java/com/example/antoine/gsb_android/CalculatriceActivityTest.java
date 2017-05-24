package com.example.antoine.gsb_android;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Antoine on 24/05/2017.
 */
public class CalculatriceActivityTest {
    @Test
    public void plusClick() throws Exception {
        assertEquals(4,2+2);
    }

    @Test
    public void moinsClick() throws Exception {
        assertEquals(4,6-2);

    }

    @Test
    public void mulClick() throws Exception {
        assertEquals(8,4*2);
    }

    @Test
    public void divClick() throws Exception {
        assertEquals(16,32/2);

    }

}
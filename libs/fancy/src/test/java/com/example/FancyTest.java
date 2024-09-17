package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FancyTest
{
    @Test
    public void shouldUseDefaultMessageIfNothingGiven()
    {
        final Fancy fancy = Fancy.create();

        assertEquals(fancy.getMessage(), "Hello World");
    }

    @Test
    public void shouldUseCustomMessageIfOneGiven()
    {
        final Fancy fancy = Fancy.create("Yo yo yoooo!");

        assertEquals(fancy.getMessage(), "Yo yo yoooo!");
    }
}
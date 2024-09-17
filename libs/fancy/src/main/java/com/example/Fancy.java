package com.example;

public class Fancy
{
    private static final String DEFAULT_MESSAGE = "Hello World";

    private final String message;

    Fancy(final String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public static Fancy create()
    {
        return new Fancy(DEFAULT_MESSAGE);
    }

    public static Fancy create(final String message)
    {
        return new Fancy(message);
    }
}
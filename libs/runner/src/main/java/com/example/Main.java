package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(final String... args)
    {
        final Fancy fancy = args.length > 0
                ? Fancy.create(args[0])
                : Fancy.create();

        LOGGER.info(fancy.getMessage());
    }
}
package com.company;

import java.io.IOException;

/**
 * Throwing a checked exception
 *
 */
public class Clip02
{
    public static void main( String[] args )
    {
        // This doesn't work
        //doThrow(new IOException());

        // These do work
        doThrowGeneric(new IOException());
        // Or
        //Main.<RuntimeException>doThrowGeneric(new IOException());
    }

    static void doThrow(Exception e) throws RuntimeException {
        throw (RuntimeException) e;
    }

    static <E extends Exception> void doThrowGeneric(Exception e) throws E {
        throw (E) e;
    }
}

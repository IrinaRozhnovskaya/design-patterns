package com.javarush.task1904;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;


    void close() throws IOException;
}
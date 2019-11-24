package com.javarush.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
        public  Person read() throws IOException {
            Scanner scanner = new Scanner("c:\\test.txt");
            String[] array = scanner.nextLine().split(" ");
            String firstName = array[0];
            String middleName = array[1];
            String lastName = array[2];
            Date date = new Date(Integer.parseInt(array[5]),Integer.parseInt(array[4]),Integer.parseInt(array[3]));
            return new Person(firstName, middleName, lastName, date);
        }
        public void close() throws IOException {
          this.fileScanner.close();
        }
    }
}
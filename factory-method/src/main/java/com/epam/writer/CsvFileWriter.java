package com.epam.writer;

public class CsvFileWriter extends AbstractFileWriter {
    public void customWrite() {
        if (writeFile("test.csv","test for csv file")) {
            System.out.println("csv file create");
        } else {
            System.out.println("The csv file didn't created");
        }
    }
}

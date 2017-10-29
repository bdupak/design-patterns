package com.epam.writer;

public class TxtFileWriter extends AbstractFileWriter {
    public void customWrite() {
        if (writeFile("test.txt","test for txt file")) {
            System.out.println("txt file create");
        } else {
            System.out.println("The txt file didn't created");
        }
//        OR
//        System.out.println(writeFile("test.txt","test for txt file") ? "Txt File Create" : "Some problem Txt File didn't created");
    }
}

package com.epam.writer;

public class DocFileWriter extends AbstractFileWriter {

    public void customWrite() {
        if (writeFile("test.doc","test for Doc file")) {
            System.out.println("Doc file create");
        } else {
            System.out.println("The doc file didn't created");
        }
    }
}

package com.epam;

import com.epam.creator.CreateWriter;
import com.epam.writer.FileWriterType;

public class Main {
    public static void main(String[] args) {
        CreateWriter createWriter = new CreateWriter();
//      The main purpose of factory method we don't know what file we need create when we develop our code.
        createWriter.createWriter(FileWriterType.TXT).customWrite();
        createWriter.createWriter(FileWriterType.DOC).customWrite();
        createWriter.createWriter(FileWriterType.CSV).customWrite();

    }
}

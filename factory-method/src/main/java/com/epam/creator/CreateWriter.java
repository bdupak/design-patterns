package com.epam.creator;

import com.epam.writer.*;

public class CreateWriter {

    public CustomFileWriter createWriter(FileWriterType type) {
        switch(type) {
            case TXT:
                return new TxtFileWriter();
            case DOC:
                return new DocFileWriter();
            case CSV:
                return new CsvFileWriter();
            default:
                throw new IllegalArgumentException("Wrong File Writer Type");
        }
    }
}

package com.epam.writer;

import java.io.FileWriter;

public abstract class AbstractFileWriter implements CustomFileWriter {

    protected boolean writeFile(String fileName, String content) {
        String path = String.format("%s/factory-method/src/main/resources/%s", System.getProperty("user.dir"), fileName);
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.write(content);
            fileWriter.flush();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

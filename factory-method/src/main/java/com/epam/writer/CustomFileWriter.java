package com.epam.writer;

public interface CustomFileWriter {

    void customWrite();

//    default void writeFile(String path, String content) {
//        try (FileWriter fileWriter = new FileWriter(path, false)) {
//            fileWriter.write(content);
//            fileWriter.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

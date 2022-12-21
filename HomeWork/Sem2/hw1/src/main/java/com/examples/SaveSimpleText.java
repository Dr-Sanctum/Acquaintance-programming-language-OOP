package com.examples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveSimpleText implements SaveAs {

    @Override
    public void Save(Map<String, Float> body) {
        try (FileWriter writer1 = new FileWriter("file.txt", false)) {
            for (Map.Entry<String, Float> entry : body.entrySet()) {
                writer1.write (entry.toString());
                writer1.write ("\n");
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}

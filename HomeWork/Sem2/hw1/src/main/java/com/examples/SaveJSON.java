package com.examples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;


public class SaveJSON implements SaveAs {


    @Override
    public void Save(Map<String, Float> body) {
        Gson asd = new Gson();
        asd.toJson(body);
        
        try (FileWriter writer1 = new FileWriter("file.json", false)) {
            writer1.write(asd.toJson(body));
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}

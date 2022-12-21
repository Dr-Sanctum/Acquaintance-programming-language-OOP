package com.examples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.thoughtworks.xstream.XStream;

public class SaveXML implements SaveAs {

    @Override
    public void Save(Map<String, Float> body) {
        XStream xstream = new XStream();

        try (FileWriter writer1 = new FileWriter("file.xml", false)) {
            writer1.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            writer1.write(xstream.toXML(body));

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}

package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class MainNoText {
    public static void main(String[] args) {
        try {
            new MainNoText().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start() throws Exception {
        // Create a SampleXml object
        SampleXml sampleXml = new SampleXml("AttributeStringValue", "TextContent");

        // Marshalling (Java object to XML)
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(SampleXml.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(sampleXml, writer);

        // Print the generated XML
        System.out.println("Generated XML:");
        System.out.println(writer.toString());    }
}

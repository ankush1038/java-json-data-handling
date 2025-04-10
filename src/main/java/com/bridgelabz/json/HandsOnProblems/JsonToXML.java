package com.bridgelabz.json.HandsOnProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JsonToXML {
    public static void main(String[] args) {
        try {


            ObjectMapper jsonmapper = new ObjectMapper();
            XmlMapper xmlMapper = new XmlMapper();

            // Read JSON File
            JsonNode jsonNode = jsonmapper.readTree(new File("jsontoxml.json"));

            // Convert to XML string
            String xml = xmlMapper.writer().withRootName("Person").writeValueAsString(jsonNode);

            System.out.println("Converted to XML: " + xml);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

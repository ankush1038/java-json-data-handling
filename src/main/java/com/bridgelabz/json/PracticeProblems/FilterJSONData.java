package com.bridgelabz.json.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterJSONData {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON
            JsonNode jsonNode = mapper.readTree(new File("filter_data.json"));

            System.out.println("Students with age greater than 25: ");

            for (JsonNode s: jsonNode){
                if(s.has("age") && s.get("age").asInt()>25){
                    System.out.println(s);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

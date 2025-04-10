package com.bridgelabz.json.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import java.io.File;
import java.io.IOException;

public class ValidateJson {
    public static void main(String[] args) throws IOException, ProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode schemaNode = mapper.readTree(new File("Schema_Jackson.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema =  factory.getJsonSchema(schemaNode);

        // Load JSON data
        JsonNode jsonData = mapper.readTree(new File("info.json"));

        // Validate JSON
        if(schema.validate(jsonData).isSuccess()){
            System.out.println("JSON is valid");
        } else{
            System.out.println("Invalid JSON!");
        }
    }
}

package com.bridgelabz.json.PracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }
}

public class ConvertList {
    public static void main(String[] args) throws JsonProcessingException {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Ankush Sharma", 21, "ankush@gmail.com"));
        list.add(new Student("Ansh", 19, "ansh@gmail.com"));
        list.add(new Student("Aditya", 19, "aditya@gmail.com"));
        list.add(new Student("Jashan", 19, "jashan@gmail.com"));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);

        // Print JSON Array
        System.out.println("JSON Array: ");
        System.out.println(jsonArray);
    }
}

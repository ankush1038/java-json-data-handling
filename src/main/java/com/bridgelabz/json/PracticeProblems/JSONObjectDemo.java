package com.bridgelabz.json.PracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;

    class JSONObjectDemo {
        public static void main(String[] args) {
            JSONObject student = new JSONObject();
            student.put("name", "Rahul Mehta");
            student.put("age", 20);

            JSONArray subjects = new JSONArray();
            subjects.put("Math");
            subjects.put("Science");
            subjects.put("English");

            student.put("subjects", subjects);

            System.out.println(student.toString(2));
        }
    }



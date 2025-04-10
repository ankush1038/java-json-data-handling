package com.bridgelabz.json.PracticeProblems;

import org.json.JSONObject;

public class MergeJSON {
    public static void main(String[] args) {
        JSONObject object1 = new JSONObject();

        object1.put("name: ","Ankush");
        object1.put("age: ",21);

        JSONObject object2 = new JSONObject();

        object2.put("id: ",1038);
        object2.put("email: ", "ankush@gmail.com");

        for(String  key : object2.keySet()){
            object1.put(key,object2.get(key));
        }

        System.out.println("Merged JSON objects: " + object1.toString());
    }
}

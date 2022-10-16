package com.example.firebaseproject;

public class Students   {
    String name,id,course;

    public Students(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }
}

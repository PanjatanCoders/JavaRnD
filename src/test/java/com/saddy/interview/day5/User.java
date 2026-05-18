package com.saddy.interview.day5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
    private String name;
    private int age;
    private String city;

    public User() {}
    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    static void main() throws JsonProcessingException {
        String json = "{ \"name\":\"Saddam\", \"age\":35, \"city\":\"Pune\" }";
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json, User.class);

        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getCity());
    }
}

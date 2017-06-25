package com.example.pdr_m.gopets;

/**
 * Created by laura on 25-Jun-17.
 */

public class CatData {
    String name;
    String sex;
    String size;
    String age;
    String state;

    public CatData(String name, String sex, String size, String age, String state) {
        this.name = name;
        this.sex = sex;
        this.size = size;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

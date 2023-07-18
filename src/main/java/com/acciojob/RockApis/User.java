package com.acciojob.RockApis;

public class User {

    private int userId; //This should be unique

    private String name;

    private int age;

    private String emailId;

    private String mobNo;

    public User() {
    }

    public User(int id, String name, int age, String emailId, String mobNo) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.mobNo = mobNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}

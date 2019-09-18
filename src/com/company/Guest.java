package com.company;

class Guest {
    private int age;
    private String name;
    private String idNumber;

    public Guest() {
    }

    public Guest(int age, String name, String idNumber) {
        this.age = age;
        this.name = name;
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}

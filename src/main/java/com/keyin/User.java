package com.keyin;

public class User {
    private String fName;
    private String lName;
    private int age;
    private String birthdate;
    private String address;
    private BankAccount bk;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String fName, String lName, int age, String birthdate, String address,BankAccount bk) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.birthdate = birthdate;
        this.address = address;
        this.bk = bk;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", bk=" + bk +
                '}';
    }
}

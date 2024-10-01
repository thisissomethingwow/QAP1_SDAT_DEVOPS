package com.keyin;

public class User {
    private String fName;
    private String lName;
    private int age;
    private String birthdate;
    private final BankAccount bk;

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
        if (isValidAge(age)){
            this.age = age;
        }

    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    public User(String fName, String lName, int age, String birthdate,BankAccount bk) {
        this.fName = fName;
        this.lName = lName;
        if (isValidAge(age)){
            this.age = age;
        }
        this.birthdate = birthdate;
        this.bk = bk;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                ", bk=" + bk +
                '}';
    }

    public boolean isValidAge(int age){
        if (age<19) {
            System.out.println("You are not old enough get older");
            return false;
        }
        else {
            return true;
        }
    }




}

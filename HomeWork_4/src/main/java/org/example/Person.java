package org.example;

public class Person {
    private int id;
    private String fio;
    private long cardNumber;
    private long hashPass;
    private String login;

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public long getHashPass() {
        return hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setHashPass(long hashPass) {
        this.hashPass = hashPass;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}


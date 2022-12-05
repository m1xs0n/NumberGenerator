package com.NumberGenerator.RegistrationAndAuthorazation;

public class User {
    private String login;
    private String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;



    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return new StringBuffer()
                .append(this.login)
                .append("\n")
                .append(this.password)
                .append("\n")
                .toString();

    }

}

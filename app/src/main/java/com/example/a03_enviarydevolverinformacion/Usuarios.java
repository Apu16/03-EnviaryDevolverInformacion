package com.example.a03_enviarydevolverinformacion;

import java.io.Serializable;

public class Usuarios implements Serializable {
    private String email;
    private String password;

    public Usuarios(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // -------- toString

    @Override
    public String toString() {
        return "Usuarios{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

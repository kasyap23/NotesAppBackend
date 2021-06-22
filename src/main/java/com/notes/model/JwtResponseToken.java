package com.notes.model;

import java.io.*;

public class JwtResponseToken implements Serializable {


    private final String jwttoken;

    public JwtResponseToken(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }

}

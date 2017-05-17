package com.example.Bharath.myapplication.backend;

/** The object model for the data we are sending through endpoints */
public class Joke {

    private final String text;

    public Joke(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
package com.techelevator.gametext.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {

    private String id;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Choices")
    private String[] choices;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Terminal" +
                "\n--------------------------------------------" +
                "\n Text: " + text +
                "\n Choices: " + choices;

    }
}

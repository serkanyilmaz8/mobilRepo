package com.serkanyilmaz.week12;

import com.google.firebase.database.Exclude;

import com.google.firebase.Timestamp;

public class Note {
    @Exclude
    private String id;
    private Timestamp date;
    private String content;

    public String getId() {
        return id;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

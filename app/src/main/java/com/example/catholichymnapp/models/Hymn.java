package com.example.catholichymnapp.models;

public class Hymn {
    private String title;
    private String subtitle;

    public Hymn(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}

package com.example.a1405001.stories;

/**
 * Created by 1405001 on 24-04-2018.
 */

public class Setter_getter_stroies {

    private String title, genre, year;

    public Setter_getter_stroies() {
    }

    public Setter_getter_stroies(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
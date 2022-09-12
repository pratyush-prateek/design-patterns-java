package com.designpatters.prototype;

public class Movie extends Product{
    private int playTime;
    private int rating;
    public Movie() {}
    public Movie(Movie source) {
        super(source);
        this.playTime = source.playTime;
        this.rating = source.rating;
    }

    public Product clone() {
        return new Movie(this);
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

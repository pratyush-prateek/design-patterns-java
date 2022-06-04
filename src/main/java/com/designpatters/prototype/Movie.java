package com.designpatters.prototype;

public class Movie extends Product{
    private int duration;
    public Movie(){}
    public Movie(Movie source) {
        super(source);
        this.duration = source.getDuration();
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public Product clone() {
        return new Movie(this);
    }

    @Override
    public String toString() {
        StringBuilder stringRep = new StringBuilder();
        stringRep.append(this.getTitle());
        stringRep.append(",");
        stringRep.append(this.getDuration());
        stringRep.append(",");
        stringRep.append(this.getPrice());
        stringRep.append(",");
        stringRep.append(this.getUrl());
        return stringRep.toString();
    }
}

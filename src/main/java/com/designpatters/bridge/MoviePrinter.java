package com.designpatters.bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
    private Movie movie;
    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String getHeader() {
        return movie.getClassification();
    }

    @Override
    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Rutime",movie.getRuntime()));
        details.add(new Detail("Name", movie.getName()));
        details.add(new Detail("Rating", movie.getRating()));
        return details;
    }
}

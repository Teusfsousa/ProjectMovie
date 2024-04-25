package Packge.movie;

import calculos.Classification;
import Title.packge.Title;

public class Movie extends Title implements Classification {
    private String director;
    private String name;

    public Movie(String nome, int year) {
        super(nome, year);


    }

    public String getDirector() {

        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) returnMedia() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + "(" + this.getReleaseYear() + ")";
    }
}

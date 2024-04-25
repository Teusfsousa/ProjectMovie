package Main.with.stripes.packge;

import Packge.movie.Movie;
import Serie.packge.series.Series;
import Title.packge.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithStripes {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Fast an furious ", 2017);
        Series ozark = new Series("Ozark ",  2020);
        Movie movie = new Movie("Avatar ", 2023);
        Movie mymovie = new Movie("The doctor ", 1991);
        ArrayList<Title> ListMovie = new ArrayList<>();
        ListMovie.add(mymovie);
        ListMovie.add(myMovie);
        ListMovie.add(movie);
        ListMovie.add(ozark);
        System.out.println("The size of the list and " + ListMovie.size());
        for (Title item: ListMovie){
            System.out.println(item);

        }
        ArrayList<String>listOfActors = new ArrayList<>();
        listOfActors.add("Jooel moore");
        listOfActors.add("Paul walker");
        listOfActors.add("Tyler james");
        System.out.println(listOfActors);
        System.out.println("Orded list ");
        Collections.sort(ListMovie);
        System.out.println(ListMovie);
        ListMovie.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(ListMovie);



    }
}

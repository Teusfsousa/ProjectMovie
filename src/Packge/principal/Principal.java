package Packge.principal;

import Filter.RecommendationFilter;
import calculos.TimeCalculator;
import Episodio.packge.Episodio;
import Packge.movie.Movie;
import Serie.packge.series.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Fast an furious", 2017);   //nome do filme da classe Packge.movie.Movie
        myMovie.setDurationInMinutes(180); // duração em minutos do filme
        
        myMovie.datasHeet();
        myMovie.evaluate(5);
        myMovie.evaluate(8);
        myMovie.evaluate(10);

        System.out.println(myMovie.getTotalAssessment());
        System.out.println("Total reviews " + myMovie.getTotalAssessment());
        System.out.println(myMovie.returnMedia());

        Series ozark = new Series("Ozark", 2020);
        ozark.datasHeet();
        ozark.setSeasons(4);
        ozark.setEpisodesPerSeasons(40);
        ozark.setMinutesPerEpisiodes(25);
        ozark.setDurationInMinutes(50);
        System.out.println("Duration to marathon ozark " + ozark.getDurationInMinutes());

        Movie movie = new Movie("Avatar ",2023);
        movie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.included(myMovie);
        calculator.included(movie);
        calculator.included(ozark);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.Filter(myMovie);

        Episodio epispdio = new Episodio();
        epispdio.setNumero(5);
        epispdio.setNome(ozark.getName());
        epispdio.setTotalViwes(100);
        filter.Filter(epispdio);

        Movie mymovie = new Movie("The doctor", 1991);
        mymovie.setDurationInMinutes(200);
        mymovie.setAssessment(10);

        ArrayList<Movie> ListMovie = new ArrayList<>();
        ListMovie.add(mymovie);
        ListMovie.add(myMovie);
        System.out.println("List size " + ListMovie.size());
        System.out.println("First movie " + ListMovie.get(0).getName()); //trabalhando com listas de array nesse projeto
        System.out.println(ListMovie);
        System.out.println("Of movie toString " + ListMovie.get(0).toString());
    }

}
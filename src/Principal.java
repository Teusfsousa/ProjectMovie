import Filter.RecommendationFilter;
import calculos.TimeCalculator;
import movie.packge.Epispdio;
import movie.packge.Movie;
import movie.packge.Series;

public class Principal {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setName("Fast and furious 7"); //nome do filme da classe movie.packge.Movie
        myMovie.setDurationInMinutes(180); // duração em minutos do filme
        myMovie.setIncludePlan(true);
        myMovie.setReleaseYear(2017); //ano de lançamento

        //myMovie.assessment = 7.7; // avaliação do filme
        //myMovie.totalAssessment = 10; // total de avaliação do filme

        myMovie.datasHeet();
        myMovie.evaluate(5);
        myMovie.evaluate(8);
        myMovie.evaluate(10);

        System.out.println(myMovie.getTotalAssessment());
        System.out.println("Total reviews " + myMovie.getTotalAssessment());
        System.out.println(myMovie.returnMedia());

        Series ozark = new Series();
        ozark.setName("Ozark");
        ozark.setReleaseYear(2017);
        ozark.datasHeet();
        ozark.setSeasons(4);
        ozark.setEpisodesPerSeasons(40);
        ozark.setMinutesPerEpisiodes(25);
        ozark.setDurationInMinutes(50);
        System.out.println("Duration to marathon ozark " + ozark.getDurationInMinutes());

        Movie movie = new Movie();
        movie.setName("Avatar");
        movie.setReleaseYear(2023);
        movie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.included(myMovie);
        calculator.included(movie);
        calculator.included(ozark);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.Filter(myMovie);

        Epispdio epispdio = new Epispdio();
        epispdio.setNumero(1);
        epispdio.setNome(ozark.getName());
        epispdio.setTotalViwes(300);
        filter.Filter(epispdio);
    }

}
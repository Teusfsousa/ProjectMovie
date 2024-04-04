import movie.packge.Movie;

public class Principal {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setName("Fast and furious 7"); //nome do filme da classe movie.packge.Movie
        myMovie.setDurationInMinutes(180); // duração em minutos do filme

        //myMovie.assessment = 7.7; // avaliação do filme
        //myMovie.totalAssessment = 10; // total de avaliação do filme

        myMovie.setReleaseYear(2017); //ano de lançamento
        myMovie.exibeFicha();
        myMovie.avalia(5);
        myMovie.avalia(8);
        myMovie.avalia(10);
        System.out.println(myMovie.getTotalAssessment());
        System.out.println("Total reviews" + myMovie.getTotalAssessment());
        System.out.println(myMovie.returnMedia());
    }
}
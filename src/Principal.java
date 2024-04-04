public class Principal {
    public static void main(String[] args) {

Movie myMovie = new Movie();
myMovie.name = "Fast and furious 7"; //nome do filme da classe Movie
myMovie.durationInMinutes = 180; // duração em minutos do filme
myMovie.assessment = 7.7; // avaliação do filme
myMovie.totalAssessment = 10; // total de avaliação do filme
 myMovie.releaseYear = 2017; //ano de lançamento
        myMovie.exibeFicha();
        myMovie.avalia(5);
        myMovie.avalia(8);
        myMovie.avalia(10);
        System.out.println(myMovie.assessment);
        System.out.println(myMovie.totalAssessment);
        System.out.println(myMovie.returnMedia());
    }
}
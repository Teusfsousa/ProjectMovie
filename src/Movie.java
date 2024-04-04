public class Movie {


    String name; //nome do filme
    int releaseYear; //ano de lançamento
    boolean includePlan; //se esta inlcuido no plano ou não
    double assessment;  //avalicao do filme
    int totalAssessment; //total de avaliação do filme
    int durationInMinutes;  // duração do filme
 void exibeFicha(){
     System.out.println("O nome do filme é " + name + "E o ano de lançamento é : " + releaseYear);
     System.out.println("A duração do filme é" + durationInMinutes);
 }
 void avalia(double nota){
     assessment += nota;
     totalAssessment++;
 }
 double returnMedia(){
     return assessment / totalAssessment;

 }

}

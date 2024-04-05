package movie.packge;

public class Movie {


    private String name; //nome do filme
    private int releaseYear; //ano de lançamento
    private boolean includePlan; //se esta inlcuido no plano ou não
    private int assessment;  //avalicao do filme
    private int totalAssessment; //total de avaliação do filme
    private int durationInMinutes;  // duração do filme

    public int getTotalAssessment(){
        return totalAssessment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public void exibeFicha(){
     System.out.println("The name of the movie is " + name);
     System.out.println("The year of release is " + releaseYear);
     System.out.println("duration for this movie is " + durationInMinutes);
 }
   public void avalia(double nota){
     assessment += nota;
     totalAssessment++;
 }
    public double returnMedia(){
     return assessment / totalAssessment;

 }

}

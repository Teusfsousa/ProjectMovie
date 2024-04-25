package Title.packge;

public class Title implements Comparable<Title> {

    private String name; //nome do filme
    private int releaseYear; //ano de lançamento
    private boolean includePlan; //se esta inlcuido no plano ou não
    private int assessment;  //avalicao do filme
    private int totalAssessment; //total de avaliação do filme
    private int durationInMinutes;  // duração do filme

    public Title (String name, int releaseYear){
        this.name = name;
        this.releaseYear = releaseYear;
    }
    public int getTotalAssessment(){

        return totalAssessment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludePlan() {
        return includePlan;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public void setTotalAssessment(int totalAssessment) {
        this.totalAssessment = totalAssessment;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void evaluate(int note){
        assessment += note;
        totalAssessment++;
    }

    public double returnMedia(){
        return assessment / totalAssessment;
    }
    public void datasHeet(){
        System.out.println("The name of the movie is " + name);
        System.out.println("The year of release is " + releaseYear);
        System.out.println("Duration for this movie is " + durationInMinutes);
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }
}

package Title.packge;

import br.com.year.exception.ErrorYearException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name; //nome do filme
    @SerializedName("Year")
    private int releaseYear; //ano de lançamento

    private int assessment;  //avalicao do filme
    private int totalAssessment; //total de avaliação do filme
    private int durationInMinutes;  // duração do filme

    public Title (String name, int releaseYear){
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(MyTitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        if(myTitleOmdb.year().length() > 4){
            throw new ErrorYearException("I couldn't change the title because it contains more than 4 characters");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
    }

    public int getTotalAssessment(){

        return totalAssessment;
    }

    public String getName() {
        return name;
    }



    public int getReleaseYear() {
        return releaseYear;
    }






    public void setAssessment(int assessment) {
        this.assessment = assessment;
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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", releaseYear=" + releaseYear + "," +
                "Duration in minutes: "+
                durationInMinutes +
                '}';
    }
}


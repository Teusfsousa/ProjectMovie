package Filter;

import calculos.Classification;

public class RecommendationFilter {
    public void Filter(Classification classifica){
        if (classifica.getClassification() >= 4){
            System.out.printf("It is among the favorites");
        } else if (classifica.getClassification() <= 2) {
            System.out.printf("Very well rated");
            {
            }
        }else{
            System.out.println("Put it to watch later");}
    }
}


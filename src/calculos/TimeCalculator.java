package calculos;

import Title.packge.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void included(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}

package Serie.packge.series;

import Title.packge.Title;

public class Series extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeasons;
    private int minutesPerEpisiodes;

    public Series(String name, int year) {
        super(name, year);
    }


    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public int getMinutesPerEpisiodes() {
        return minutesPerEpisiodes;
    }

    public void setMinutesPerEpisiodes(int minutesPerEpisiodes) {
        this.minutesPerEpisiodes = minutesPerEpisiodes;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeasons * minutesPerEpisiodes;
    }

    @Override
    public String toString() {
        return "Serie "  + this.getName() + "(" + getReleaseYear() + ")";
    }
}






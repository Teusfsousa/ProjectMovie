package movie.packge;

public class Series extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeasons;
    private int minutesPerEpisiodes;

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
}





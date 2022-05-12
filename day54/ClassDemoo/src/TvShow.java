public class TvShow {
    
    private String name;
    private int episodes;
    private String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public void setEpisode(int episodes) {
        this.episodes = episodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "TvShow [episode=" + getEpisodes() + ", genre=" + getGenre() + ", name=" + getName() + "]";
    }
    
    
    
}

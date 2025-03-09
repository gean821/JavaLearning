package IntroducaoJava.Lambdas.Dominio;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }


    public int getEpisodes() {
        return episodes;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes =" + episodes +
                '}';
    }
}

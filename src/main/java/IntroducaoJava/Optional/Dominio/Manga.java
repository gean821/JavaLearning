package IntroducaoJava.Optional.Dominio;

public class Manga {
    private String title;
    private Integer id;
    private int chapters;

    public Manga(String title, Integer id, int chapters) {
        this.title = title;
        this.id = id;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", chapters=" + chapters +
                '}';
    }

}

package IntroducaoJava.Streams.Dominio;

import java.util.Objects;

public class Times {


    private String nome;
    private double price;
    private Categories categories;


    public Times(String title, double price, Categories categories) {
        this.nome = title;
        this.price = price;
        this.categories = categories;
    }

    public Categories getCategories() {
        return categories;
    }

    public Times(String title, double price) {
        this.nome = title;
        this.price = price;
    }


    public String getNome() {
        return this.nome;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Times{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                '}';
    }

    public Promotion getPromotion() {
        return price < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Times that = (Times) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, price, categories);
    }
}

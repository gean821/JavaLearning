package IntroducaoJava.Polimorfismo.Dominio;

public abstract class Produto implements Taxavel { //como a classe foi abstrata eu nao precisei criar o método da taxavel
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() {
        return this.nome;
    }
    public double getValor() {
        return this.valor;
    }

//CRIAMOS A CLASSE ABSTRATA PRODUTO PQ ELE NAO DEVE SER CRIADO OBJETO E SIM AS SUBCLASSES : COMP E TOMATE, ETC
//em seguida criei as classes dos produtos que extendem ele, por isso se usa os mesmos construtores
//e criamos a interface taxavel so para obrigar as outras classes extendidas dele a usar o método calcular imposto
//portanto como o produto é taxavel todas subclasses dele ficam também


}

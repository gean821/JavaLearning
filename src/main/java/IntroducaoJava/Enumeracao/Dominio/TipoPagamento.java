package IntroducaoJava.Enumeracao.Dominio;

public enum TipoPagamento {
    Debito {
       @Override
       public double calcularDesconto(double valor) {
           return valor *0.1;
       }

    },Credito {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };


    public abstract double calcularDesconto(double valor); //método criado apenas para ser sobrescrito, e nao tem corpo.



}



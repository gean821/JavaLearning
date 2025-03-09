package IntroducaoJava.String.Test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concactString(1_000_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String : " + (fim-inicio) + " Ms");

        inicio = System.currentTimeMillis();
        concactStringBuilder(1_000_000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String builder : " + (fim-inicio) + " Ms");

        inicio = System.currentTimeMillis();
        concactStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Buffer : " + (fim-inicio) + " Ms");

    }

    private static void concactString(int tamanho) {
        String texto = "";
        for (int i = 0; i< tamanho; i++) {
            texto += i; //0,01,012,013;
        }
    }

    private static void concactStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i< tamanho; i++) {
            sb.append(i); //0,01,012,013;
        }
    }
    private static void concactStringBuffer(int tamanho) { //para ambiente de multiplas threads.
            StringBuilder sb = new StringBuilder(tamanho);
            for (int i = 0; i< tamanho; i++) {
                sb.append(i); //0,01,012,013;
            }
        }
}



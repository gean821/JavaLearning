package IntroducaoJava.Formatacao.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
//é legado.Ou seja, nao compensa usar mais
//util criada com o objetivo de formatação de dados mais flexivel que dateFormat
public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = " 'Amsterdam'  dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date())); //para pegar data de hoje;





    }
}


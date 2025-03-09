package IntroducaoJava.Formatacao.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Todas vezes que ver format quer dizer q estou transformando o objeto para String .
//Parse transforma de uma String para o objeto.
public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s3 = date.format(DateTimeFormatter.BASIC_ISO_DATE); //formata ano mes e dia sem espaço

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //AGORA DIGAMOS QUE TENHO A STRING E QUERO TRANSFORMA-LA EM OBJETO
        LocalDate parse1 = LocalDate.parse("20250203",DateTimeFormatter.BASIC_ISO_DATE ); //para transformar a string para objeto eu preciso pegar a String e coloca-la e depois o formatter dela,retornando assim o objeto escrito.
        System.out.println(parse1);
        System.out.println(LocalDate.parse("2025-02-03",DateTimeFormatter.ISO_LOCAL_DATE ));
        System.out.println(LocalDate.parse("2025-02-03",DateTimeFormatter.ISO_DATE ));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("AGORA FAZENDO O PARSE PARA LOCALDATETIME:");
        System.out.println(LocalDateTime.parse("2025-02-03T20:34:13.5776677", DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(LocalDateTime.parse("2025-02-03T20:34:13.5776677", DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterUK = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(LocalDate.now().format(formatterBr)); //USANDO DATAS BR
        System.out.println(LocalDate.now().format(formatterUK)); //USANDO DATAS de fora.

        System.out.println(LocalDate.parse("03/02/2025",formatterBr)); //fazendo o parse da data br
        System.out.println(LocalDate.parse("2025/02/03",formatterUK));

        DateTimeFormatter dataAlemao = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        System.out.println(LocalDate.now().format(dataAlemao));
        System.out.println(LocalDate.parse("03.Februar.2025",dataAlemao)); //posso fazer o parse de volta.


        System.out.println(" ");
        System.out.println(" ");


        System.out.println("informe uma data : ");
        DateTimeFormatter dataUsuario = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(dataUsuario));

        DateTimeFormatter formata1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(LocalDateTime.now().format(formata1));
        //formatando ela
        DateTimeFormatter formatada2 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        System.out.println(LocalDateTime.now().format(formatada2));

        DateTimeFormatter formata3 = DateTimeFormatter.ofPattern("dd/MM/yy- HH'h'mm");
        System.out.println(LocalDateTime.now().format(formata3));


    }
}

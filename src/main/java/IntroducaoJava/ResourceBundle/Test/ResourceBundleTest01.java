package IntroducaoJava.ResourceBundle.Test;
import java.util.Locale;
import java.util.ResourceBundle;

//essa classe serve PARA TRABALHAR COM DIFERENTES LINGUAS EM APLICAÇÕES.
//nós criamos uma file dentro de SRC e pegamos a lingua que vamos usar usando : Nome da pasta+_(lingua).properties
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        //digamos agora que o usuario trocou a lingua do site :
        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("pt","BR"));
        System.out.println(bundle2.getString("hello")); //a chave precisa ser a mesma do resource bundle.
        System.out.println(bundle2.getString("good.morning"));

        //funcionamento de procurar as chaves
        //Local ("fr", "Ca");       //caso tenha uma pasta assim
        //message_fr_CA.properties  //n achou procura essa
        //message_fr.properties     /n achou procura essa
        //message_pt_BR.properties  //nao achou vai pra lingua do Pc
        //message_pt.properties      //e dps nessa
        //message.properties           //se nao achar nem aqui lança exceção







        Boolean sla = bundle.containsKey("sla");
        System.out.println(sla);  //verificando se essa chave existe no bundle
    }
}

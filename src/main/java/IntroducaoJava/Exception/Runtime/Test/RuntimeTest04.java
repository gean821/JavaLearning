package IntroducaoJava.Exception.Runtime.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

//para múltiplas exceções :
public class RuntimeTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException(); /*Usando polimorfismo aqui ele pega o erro e liga ao nome. No caso os dois index, e pega o mais proximo
             *então lançando um throw ele pega o catch que mais se adequa ao throw lançado.*/
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do array erro");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de indice errado");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de ilegal");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de aritmetica.");
        } catch (RuntimeException e ) {
            System.out.println("dentro de runtime");
        }
        try {
            talvezLanceException();
        }catch(Exception e ) { //as duas vao ser capturadas pois execption é a classe mais generica
            e.printStackTrace();
        }

    }


    private static void talvezLanceException() throws SQLException,FileNotFoundException {

    }

}





/*sabemos que Runtime exception tem que ficar por ultimo pois ela é a excecao mais generica (pai de todas).
   senao a referencia vai ser sempre para ela. */
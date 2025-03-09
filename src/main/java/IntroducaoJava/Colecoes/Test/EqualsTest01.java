package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.SmartPhone;

import java.util.ArrayList;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC2","Iphone");
        SmartPhone s2 = new SmartPhone("1ABC2","Iphone");
        System.out.println(s1.equals(s2)); //comparando se o valor em memória é igual ao objeto.No caso é falso pois sao dois objetos diferentes, mas com o mesmo nome
                                            //porém devemos notar que o numero de série é igual, e portanto sao objetos iguais, que deveriam retornar true
                                            //para isso vamos fazer uma sobrescrita dentro de Smartphone da classe Obj
                                                //nos vamos retornar true quando o serial number sao iguais nesta regra de negócio
            }

}

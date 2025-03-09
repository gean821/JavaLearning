package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1","Iphone");
        SmartPhone s2 = new SmartPhone("22222","Samsung");
        SmartPhone s3 = new SmartPhone("3333","Pixel");

        List<SmartPhone> smartPhones = new ArrayList<>(6);
        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);
                                        //smartPhones.clear(); //deleta todos os itens dentro do array
        for (SmartPhone smartPhone: smartPhones) {
            System.out.println(smartPhone);
        }
        SmartPhone s4 = new SmartPhone("22222","Samsung");
        smartPhones.add(0,s4); //posso trocar a posicao do s4 para ser 0 .
        System.out.println(smartPhones.contains(s4)); //para ver se existe esse item no arrayList
        System.out.println(smartPhones.indexOf(s4)); //para ver qual indice do array está o s4.

    }
}

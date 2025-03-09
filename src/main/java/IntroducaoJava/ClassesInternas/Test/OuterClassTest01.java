package IntroducaoJava.ClassesInternas.Test;
//classes internas basicamente sao classes dentro da outra
//sao úteis para organizar código, porém nem tanto usadas no dia a dia.
public class OuterClassTest01 {
    private String name = "Gean Costa Ramos";
    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        OuterClassTest01.Inner inner =  outerClass.new Inner(); //preciso instanciar inner a partir de um objeto da classe externa.
        inner.printOuterClassAttribute(); //ai imprimo.
    }


    class Inner { //basicamente ele e como um método, mas tem atributos e pode acessar todos os objetos da classe mais externa.
        public void printOuterClassAttribute() {
            System.out.println("nome : " + name);
        }

    }
}






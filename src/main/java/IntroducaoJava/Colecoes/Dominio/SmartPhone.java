package IntroducaoJava.Colecoes.Dominio;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone (String serialNumber,String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //O hashCode é um número que vai ser gerado, de preferencia unico para os objetos e nem sempre vai ser unico para os objetos.
    //O quando eu implemento o hashCode ele tem que dar um match no equals. Se eu uso o serialNumber para verificar igual, uso no hashCode o serial também.
    //se x.equals(y) == true, y.hashCode(x) == x.hashCode()
    //y.hashCode == x.hashCode() nao necessariamente o equals de y.equals(x) tem que ser true
    //x.equals(y) == false
    //y.hashCode() != x.hashCode(), x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode(); //já tem um hashCode implementado dentro da classe hashCode

    }

    //Reflexivo : x.equals(x) tem que ser true para tudo que for diferente de null
    //simétrico : para x e y  diferentes de null, se x.equals(y) == true, logo, y.equals(x) == true.
    //transitividade : para x,y,z diferentes de null, se x.equals(y) == true, e  x.equals(z), y.equals(z) == true;
    //consistente : x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null,x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) { //o this sempre vai ser o objeot a ser comparado com o obj, no caso é o obj. EX : s1.equals(s2) s1 = this s2 = obj
       if (obj == null) return false; // se o obj a ser comparado for nulo, retorna falso
       if (this == obj) return true; //verifica se os dois sao iguais, se for retorna true.
       if (this.getClass() != obj.getClass()) return false; //verifica se o this é realmente um objeto;
       SmartPhone smartPhone = (SmartPhone) obj; // Aqui o cast é feito para transformar o Object em SmartPhone
       return serialNumber != null && serialNumber.equals(smartPhone.serialNumber); //retorna true qnd o serialNumber nao é nulo e quando o serial é o msm que recebe no obj


    }

    public void setSerialNumber(String SerialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }

}

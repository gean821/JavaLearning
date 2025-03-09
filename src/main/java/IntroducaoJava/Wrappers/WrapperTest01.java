package IntroducaoJava.Wrappers;

public class WrapperTest01 {
    public static void main(String[] args) {
            byte byteP = 1;
            short shortP = 1;
            int intP = 1;
            long longP = 10L;
            float floatP = 10F;
            double doubleP = 100;
            char charP = 'B';
            boolean booleanP = false;

            Byte byteW = 1;
            Short shortW = 1;
            Integer intW = 1; //AUTOBOXING de primitivo para wrapper
            Long longW = 10L;
            Float floatW = 10F;
            Double doubleW = 100.0;
            Character charW = 'B';
            Boolean booleanW = false;

            int i = intW; //UNBOXING de wrapper para primitivo
            Integer intW2 = Integer.parseInt("4");
            boolean verdadeiro = Boolean.parseBoolean("truE");
            System.out.println(verdadeiro);
            System.out.println(Character.isDigit('A'));
            System.out.println(Character.isDigit('9'));
            System.out.println(Character.isLetterOrDigit('!'));
            System.out.println(Character.isUpperCase('S'));
            System.out.println(Character.isLowerCase('S'));
            System.out.println(Character.toLowerCase('D'));
            System.out.println(Character.toUpperCase('c'));
    }
}

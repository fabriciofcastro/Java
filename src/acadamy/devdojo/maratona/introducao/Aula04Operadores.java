package acadamy.devdojo.maratona.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //
        int number = 10;
        float number2 = 20.00F;
        System.out.println(number + number2+ "Valor dos calculos" +number + number2 );

        float soma = number + number2;
        double div = number2 / number;
        double rest = number2 % number;

        System.out.println(soma);
        System.out.println(div);
        System.out.println(rest);
    }
}

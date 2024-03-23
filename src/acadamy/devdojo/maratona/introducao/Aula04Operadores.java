package acadamy.devdojo.maratona.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //
        int number = 10;
        int number2 = 20;
        System.out.println(number + number2+ "Valor dos calculos" +number + number2 );

        float soma = number + number2;
        double div = number2 / number;
        double rest = number2 % number;
        int subt = number - number2;
        int miult = number * number2;

        System.out.println(soma);
        System.out.println(div);
        System.out.println(rest);

        // operador booleano    menor - maior - menor igual -  maior igual    igual
        //                        <       >         <=             =>          ==

        boolean isMaiorQue = 10 > 20;
        boolean isMaiorIgual = 10 >= 20;
        boolean isMenorIgual =  20 <= 10;
        boolean isMenor = 10 < 20;
        boolean isIgual = 10 == 20;
        boolean isDiferente = 10 != 20;



        // operadores lógicos - &&(and) - ||(or) - !(not)

        int idade = 50;
        float salario = 5500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta );
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoShopping = valorTotalContaCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoShopping);

        // = -= += /= %= *=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 500;

        bonus *= 10;
        bonus /= 2;
        bonus %= 3;

        System.out.println(bonus);

        // operdores unários

        int contador = 0;

        contador = 1;
        contador++; // acrescenta ou diminui o valor após
        contador--;
        --contador; // acrescenta ou diminui o valor antes
        ++contador;
    }
}

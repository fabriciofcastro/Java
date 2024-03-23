package acadamy.devdojo.maratona.introducao;

import java.sql.SQLOutput;

public class Aula06EstruturasCondicionaisSwitchCase {
    public static void main(String[] args) {
        byte dia = 5;
        System.out.println("Digite 1 á 7 para indicar o dia da semama");

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Qurarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        char sexo = 'F';
        System.out.println("Digite uma Letra em maiúsculo que indica o sexo (F ou M)");

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}

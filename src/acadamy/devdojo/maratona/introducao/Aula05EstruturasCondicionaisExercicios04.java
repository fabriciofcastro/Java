package acadamy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionaisExercicios04 {
    public static void main(String[] args) {
        double salarioAnual = 35000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.37 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712) {

           valorImposto = salarioAnual * primeiraFaixa;
            System.out.println(valorImposto+ " valor do importo da primeira faixa");

        }else if (salarioAnual >= 34713 && salarioAnual <= 68507) {

           valorImposto = salarioAnual * segundaFaixa;
            System.out.println(valorImposto+ " valor do importo da segunda faixa");

        }else {
            valorImposto = salarioAnual * terceiraFaixa;
            System.out.println(valorImposto+ " valor do importo da terceira faixa");
        }

    }
}

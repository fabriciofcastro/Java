package acadamy.devdojo.maratona.introducao;

public class Aula07EstruturaRepeticaoExercicios03 {
    public static void main(String[] args) {

        double valorCarro = 40000;


            for (int parcela = 1; parcela <= valorCarro; parcela++) {

                double valorParcela = valorCarro / parcela;

                if (valorParcela >= 1000){
                    System.out.println("Parcela "+ parcela+ " R$ "+ valorParcela);
                    break;
                }
            }
    }
}

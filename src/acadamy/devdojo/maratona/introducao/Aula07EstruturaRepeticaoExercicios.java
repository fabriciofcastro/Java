package acadamy.devdojo.maratona.introducao;

public class Aula07EstruturaRepeticaoExercicios {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 1000000

        for (int i =0; i < 100; i++){
            if (i % 2 == 0) {
                System.out.println(i + " é número par");
            }else{
                System.out.println(i + " é número impar");
            }

            int numero = 0;
            while(numero < 100){
                if (numero % 2 == 0){
                    System.out.println(numero+ " é numero par");
                }else{
                    System.out.println(numero + " é número impar");
                }
            numero++;
            }
        }
    }
}

package acadamy.devdojo.maratona.introducao;

public class Aula07EstruturaRepeticaoExercicios02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 1000000

        for (int i =0; i < 100; i++) {

            int valorMax = 50;
            for(int f = 0; f <= valorMax; f++) {
                if(f > 25) {
                    break;
                }
                System.out.println(f);
            }
        }
    }
}

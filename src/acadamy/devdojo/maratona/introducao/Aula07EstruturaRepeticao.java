package acadamy.devdojo.maratona.introducao;

public class Aula07EstruturaRepeticao {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            System.out.println("Dentro do while "+ ++count);

           // count++;
        }

        count = 0;
        do {
            System.out.println("Do while "+ ++count);

        }while(count < 10);
    }
}

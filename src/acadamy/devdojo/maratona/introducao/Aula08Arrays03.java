package acadamy.devdojo.maratona.introducao;

public class Aula08Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i =0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int i:numeros3) {
            System.out.println(i);
        }
    }
}

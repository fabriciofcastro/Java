package acadamy.devdojo.maratona.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        //casting Quando você força o tipo receber quantidade de bytes além de sua capacidade

        int age = 10;
        long numberBing = 1000000;
        double wageDouble = 2000.0;
        float wageFlot = 2000.0F;
        byte ageByte = -128;
        short ageShort = 10;
        boolean isTrue = true;
        boolean isFalse = false;
        char caractere = '\u0041';

        //String não é tipo primitivo. É uma class é portanto começa com letra maiúscula
        String text = "pode ser texto de qualquer tamanho";
    }
}

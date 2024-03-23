package acadamy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionaisIfElse02 {
    public static void main(String[] args) {
        int idade = 16;

        if (idade <= 15) {
            System.out.println("Categoria infantil "+ idade);
        }else if (idade > 15 && idade < 18 ) {
            System.out.println("Categoria juvenil "+ idade);
        }else {
            System.out.println("Categoria adulto");
        }




    }
}

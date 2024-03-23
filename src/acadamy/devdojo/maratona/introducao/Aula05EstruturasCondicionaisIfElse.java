package acadamy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionaisIfElse {
    public static void main(String[] args) {
        int idade = 25;
        boolean isNaoAutorizado = idade < 20;

        if (idade >= 20) {
            System.out.println("Maior de idade pode vender bebbida "+ idade);
        }else {
            System.out.println("menor de idade");
        }



    }
}

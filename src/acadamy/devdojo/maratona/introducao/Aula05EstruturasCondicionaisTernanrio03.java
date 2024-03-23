package acadamy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionaisTernanrio03 {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoVouDoar = "Ainda não tenho condições";
        String resultado ;

        resultado = salario > 5000 ? mensagemDoar : mensagemNaoVouDoar;

        System.out.println(resultado);

        int idade = 15;
        String categoria;

        // Deve ser utilizado quando tiver duas condiçoes. Caso haja mais deve se pensar qual estrutura trará mais legibilidade

        categoria = idade <= 15 ? "Categoria juvenil" : idade > 15 && idade < 18 ? "Juvenil" : "Categoria adulto";

        System.out.println(categoria);
    }
}

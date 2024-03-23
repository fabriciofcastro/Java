package acadamy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionaisSwitchCaseExercicios {
    public static void main(String[] args) {

        System.out.println("Digite 1 a 7 para saber se é dia útil ou finalde semana");
        byte diaUtil = 7;

        switch (diaUtil) {
            case 1:
            case 7:
                System.out.println("Domingo final de semana");
                break;
            case  2:
            case  3:
            case  4:
            case  5:
            case  6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}

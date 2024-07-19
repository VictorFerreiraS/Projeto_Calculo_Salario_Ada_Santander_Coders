import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
        CalculadoraDeImpostoEInss calculadoraDeImpostoEInss = new CalculadoraDeImpostoEInss();
        int controlador = 0;
        Scanner input = new Scanner(System.in);



        do {
            calculadoraDeImpostoEInss.CacularSalarios();
            controlador = Integer.parseInt(solicitarResposta(input, "Deseja Sair? Digite (0)\nDeseja Realizar novo calculo? Digite (1)"));

        } while (controlador == 1);

    }
    public static String solicitarResposta(Scanner input, String respostaSolicitada) {
        System.out.println(respostaSolicitada);
        return input.nextLine();
    }
}
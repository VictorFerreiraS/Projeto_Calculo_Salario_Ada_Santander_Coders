import java.util.Scanner;
public class CalculadoraDeImpostoEInss {
    Scanner input = new Scanner(System.in);

    private double solicitarSalario(Scanner input, String dadoSolicitado) {
        System.out.println(dadoSolicitado);
        return input.nextDouble();
    }

    private double calcularPorcentagem(double numero, double porcentagem) {
        return (numero * porcentagem) / 100;
    }

    private double calcularInss(double salario) {
        if (salario <= 1212.00) {
            return calcularPorcentagem(salario, 7.5);
        } else if (salario >= 1212.01 && salario <= 2427.35) {
            return calcularPorcentagem(salario, 9);
        } else if (salario >= 2427.36 && salario <= 3641.03) {
            return calcularPorcentagem(salario, 12);
        } else if (salario >= 3641.04 && salario < 7087.22) {
            return calcularPorcentagem(salario, 14);
        } else {
            return calcularPorcentagem(salario, 14);
        }
    }

    private double calcularImpostoDeRenda(double salario) {
        if (salario <= 1903.98) {
            return calcularPorcentagem(salario, 0);
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            return calcularPorcentagem(salario, 7.5);
        } else if (salario >= 2826.66 && salario <= 3751.05	) {
            return calcularPorcentagem(salario, 15);
        } else if (salario >= 3751.06 && salario < 4664.68) {
            return calcularPorcentagem(salario, 22.50);
        } else {
            return calcularPorcentagem(salario, 27.50);
        }
    }

    private double calcularSalarioLiquido (double salario) {
        return (salario - calcularImpostoDeRenda(salario)) - calcularInss(salario);
    }

    public void CacularSalarios() {
        System.out.println("Olá bem vindo(a) a calculadora de salarios!");

        double salario1 = solicitarSalario(input, "Escreva o primeiro salário:");
        double salario2 = solicitarSalario(input, "Escreva o segundo salário:");
        double salario3 = solicitarSalario(input, "Escreva o terceiro salário:");
        double salario4 = solicitarSalario(input, "Escreva o quarto salário:");
        double salario5 = solicitarSalario(input, "Escreva o quinto salário:");

        System.out.println("Salario um");
        System.out.println("Salario Bruto:" + salario1);
        System.out.println("Desconto INSS:" + calcularInss(salario1));
        System.out.println("Desconto imposto De renda:" + calcularImpostoDeRenda(salario1));
        System.out.println("Salário líquido:" + calcularSalarioLiquido(salario1));
        System.out.println("--------------------------------------------");
        System.out.println("Salario Dois");
        System.out.println("Salario Bruto:" + salario2);
        System.out.println("Desconto INSS:" + calcularInss(salario2));
        System.out.println("Desconto imposto De renda:" + calcularImpostoDeRenda(salario2));
        System.out.println("Salário líquido:" + calcularSalarioLiquido(salario2));
        System.out.println("--------------------------------------------");
        System.out.println("Salario Três");
        System.out.println("Salario Bruto:" + salario3);
        System.out.println("Desconto INSS:" + calcularInss(salario3));
        System.out.println("Desconto imposto De renda:" + calcularImpostoDeRenda(salario3));
        System.out.println("Salário líquido:" + calcularSalarioLiquido(salario3));
        System.out.println("--------------------------------------------");
        System.out.println("Salario Quatro");
        System.out.println("Salario Bruto:" + salario4);
        System.out.println("Desconto INSS:" + calcularInss(salario4));
        System.out.println("Desconto imposto De renda:" + calcularImpostoDeRenda(salario4));
        System.out.println("Salário líquido:" + calcularSalarioLiquido(salario4));
        System.out.println("--------------------------------------------");
        System.out.println("Salario Cinco");
        System.out.println("Salario Bruto:" + salario5);
        System.out.println("Desconto INSS:" + calcularInss(salario5));
        System.out.println("Desconto imposto De renda:" + calcularImpostoDeRenda(salario5));
        System.out.println("Salário líquido:" + calcularSalarioLiquido(salario5));


    }
}

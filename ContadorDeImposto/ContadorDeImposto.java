import java.util.Scanner;

public class contadorDeImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário anual: ");
        double salarioAnual = scanner.nextDouble();

        double primeiraFaixa = 7.50 / 100;
        double segundaFaixa = 15.00 / 100;
        double terceiraFaixa = 22.50 / 100;
        double valorImposto;

        if (salarioAnual <=  37751) {
            valorImposto = salarioAnual * primeiraFaixa;
        }
        else if (salarioAnual > 37751 && salarioAnual <= 50148) {
            valorImposto = salarioAnual * segundaFaixa;
        }
        else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Valor do imposto: R$ " + valorImposto);

        scanner.close();

    }
}
    

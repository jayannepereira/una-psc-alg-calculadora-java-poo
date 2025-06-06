import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora(0, 0);

        String opcao;
        do {
            System.out.print("Digite o primeiro número: ");
            double numeroUm = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numeroDois = sc.nextDouble();

            calc.atualizarNumeros(numeroUm, numeroDois);

            System.out.println("\nEscolha a operação:");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Potência");
            System.out.println("[6] Raiz Quadrada do primeiro número");
            System.out.println("[Q] Sair");

            System.out.print("Opção: ");
            opcao = sc.next().toUpperCase();

            switch (opcao) {
                case "1":
                    System.out.println("Resultado da soma: " + calc.somar());
                    break;
                case "2":
                    System.out.println("Resultado da subtração: " + calc.subtrair());
                    break;
                case "3":
                    System.out.println("Resultado da multiplicação: " + calc.multiplicar());
                    break;
                case "4":
                    System.out.println("Resultado da divisão: " + calc.dividir());
                    break;
                case "5":
                    System.out.println("Resultado da potência: " + calc.potencia());
                    break;
                case "6":
                    System.out.println("Raiz quadrada: " + calc.raizQuadrada());
                    break;
                case "Q":
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println(); // linha em branco
        } while (!opcao.equals("Q"));

        sc.close();
    }
}

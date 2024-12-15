import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + "!");
        System.out.println("Digite uma das opções abaixo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Diminuir");
        System.out.println("3 - Multiplicar");
        System.out.println("2 - Dividir");
        int opcao = sc.nextInt();
        System.out.println("Digite o primeiro valor:");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        double segundoValor = sc.nextDouble();
        Calculadora calculadora = new Calculadora(primeiroValor,segundoValor);
        switch (opcao) {
            case 1:
                System.out.println(calculadora.somar(primeiroValor,segundoValor));
                break;
            case 2:
                System.out.println(calculadora.diminuir(primeiroValor,segundoValor));
                break;
            case 3:
                System.out.println(calculadora.multiplicar(primeiroValor,segundoValor));
                break;
            case 4:
                System.out.println(calculadora.dividir(primeiroValor,segundoValor));
                break;
            default:
        }
    }
}
class Calculadora{
    double primeiroValor;
    double segundoValor;

    public Calculadora(double primeiroValor, double segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    public double somar (double primeiroValor, double segundoValor){
        return primeiroValor + segundoValor;
    }
    public double diminuir (double primeiroValor, double segundoValor){
        return primeiroValor - segundoValor;
    }
    public double multiplicar (double primeiroValor, double segundoValor){
        return primeiroValor * segundoValor;
    }
    public double dividir (double primeiroValor, double segundoValor){
        return primeiroValor / segundoValor;
    }
}
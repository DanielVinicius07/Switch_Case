import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
    Scanner Calculadora = new Scanner(System.in);
    double num1, num2, resultado;
    char operacao;
    
    System.out.println("Digite o primeiro número");
    num1 = Calculadora.nextDouble();
    System.out.println("Digite o segundo número");
    num2 = Calculadora.nextDouble();
    System.out.println("Qual operação utilizar?");
    operacao = Calculadora.next().charAt(0);;

    switch (operacao) {
        case '+':
            resultado = num1 + num2;
            System.out.println("O resultado é " + resultado);
            break;
        case '-':
        resultado = num1 - num2;
        System.out.println("O resultado é " + resultado);
            break;
        case '*':
        resultado = num1 * num2;
        System.out.println("O resultado é " + resultado);
            break;
        case '/':
        resultado = num1 / num2;
        System.out.println("O resultado é " + resultado);
            break;
    
        default:
            break;
    }
    Calculadora.close();
    }
}
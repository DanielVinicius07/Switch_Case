import java.util.Scanner;
public class DiasDaSemana {
    public static void main(String[] args) throws Exception {
        Scanner Semana = new Scanner(System.in);
        int num;
        
        do{
        System.out.println("Digite um número de 1 a 7");
        num = Semana.nextInt();
        switch (num) {
            case 1:
                System.out.println("O dia da semana é Domingo");
                break;
        
            case 2:
                System.out.println("O dia da semana é Segunda-Feira");
                break;
        
            case 3:
                System.out.println("O dia da semana é Terça-Feira");
                break;
        
            case 4:
                System.out.println("O dia da semana é Quarta-Feira");
                break;
        
            case 5:
                System.out.println("O dia da semana é Quinta-Feira");
                break;
        
            case 6:
                System.out.println("O dia da semana é Sexta-Feira");
                break;
        
            case 7:
                System.out.println("O dia da semana é Sábado");
                break;
        
            default:
            System.out.println("Digite um número de 1 a 7");
                break;
        }
    }
    while (num<1 || num>7); {

    }
        Semana.close();
    }
}
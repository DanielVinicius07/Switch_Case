import java.util.Scanner;
public class EstacoesDoAno {
    public static void main(String[] args) {
        
    Scanner Estacoes = new Scanner(System.in);
    int num=1;

    do{
    System.out.println("Digite um número entre 1 e 4");
    num = Estacoes.nextInt();

    if (num<1 || num>4) {
        System.out.println("Número Inválido tente novamente");
    }
    }
    while (num<1 || num>4);  
    
    switch (num) {
        case 1:
            System.out.println("A estação do ano é Verão");
            break;
        case 2:
            System.out.println("A estação do ano é Outono");
            break;
        case 3:
            System.out.println("A estação do ano é Inverno");
            break;
        case 4:
            System.out.println("A estação do ano é Primavera");
            break;
    
        default:
        System.out.println("Digite um número entre 1 e 4");
            
    }
    Estacoes.close();
    }
}
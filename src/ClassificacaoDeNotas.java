import java.util.Scanner;

public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner Notas = new Scanner(System.in);
        int nota;

        do{
            System.out.println("Digite sua nota: ");
            nota = Notas.nextInt();

            if(nota<1 || nota>10){
                System.out.println("Nota Inválida.");
            }
        }
        while(nota<1 || nota>10);

        switch (nota) {
            case 10,9:
                System.out.println("Parabéns sua nota foi Excelente!!");
                break;
            case 8,7:
                System.out.println("Sua nota foi boa.");
                break;
            case 6,5:
                System.out.println("Sua nota foi regular.");
                break;
            case 4,3,2,1:
                System.out.println("Sua nota foi ruim.");
                break;
            case 0:
                System.out.println("Sua nota foi péssima");
                break;
        
            default:
            System.out.println("Nota Inválida.");
                break;
        }
        Notas.close();
    }
}

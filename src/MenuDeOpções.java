import java.util.Scanner;

public class MenuDeOpções {
    public static void main(String[] args) {
    
        Scanner Menu = new Scanner(System.in);
        int num;

        do{
            System.out.println("Digite um número");
            num = Menu.nextInt();

            if (num<1 || num>5){
                System.out.println("Número Inválido");
            }
        }
        while(num<1 || num>5);

        switch (num) {
            case 1:
                System.out.println("Você escolheu a opção Cadastrar Usuário");
                break;
            case 2:
                System.out.println("Você escolheu a opção Excluir Usuário");
                break;
            case 3:
                System.out.println("Você escolheu a opção Atualizar Usuário");
                break;
            case 4:
                System.out.println("Você escolheu a opção Listar Usuários");
                break;
            case 5:
                System.out.println("Você escolheu a opção Sair");
                break;
        
            default:
            System.out.println("Número Inválido!!");
                break;
        }
        Menu.close();
}    
}

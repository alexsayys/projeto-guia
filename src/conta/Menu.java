package conta;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        while (true) {
            System.out.println("\n***************************************************");
            System.out.println("\n                     COIN BANK                     ");
            System.out.println("\n***************************************************");
            System.out.println("                1 - CRIAR CONTA                      ");
            System.out.println("                2 - LISTAR CONTAS                    ");
            System.out.println("                3 - BUSCAR CONTA POR NÚMERO          ");
            System.out.println("                4 - ATUALIZAR DADOS DA CONTA         ");
            System.out.println("                5 - APAGAR CONTA                     ");
            System.out.println("                6 - SACAR                            ");
            System.out.println("                7 - DEPOSITAR                        ");
            System.out.println("                8 - TRANSFERIR                       ");
            System.out.println("                0 - SAIR                             ");
            System.out.println("\n***************************************************");
            System.out.println("ENTRE COM A OPÇÃO:                                   ");

            opcao = sc.nextInt();

            if (opcao == 9) {
                System.out.println("\nObrigado por usar a Coin Bank!");
                sc.close();//Fecha o Scanner (evita erros)
                System.exit(0);//Fecha o programa corretamente
            }

            switch (opcao) {
                case 1:
                    System.out.println("Criar conta\n\n");
                    break;

                case 2:
                    System.out.println("Listar todas as contas\n\n");
                    break;

                case 3:
                    System.out.println("Consultar dados da conta por número\n\n");
                    break;

                case 4:
                    System.out.println("Atualizar dados da conta\n\n");
                    break;

                case 5:
                    System.out.println("Apagar conta");
                    break;

                case 6:
                    System.out.println("Saque\n\n");
                    break;

                case 8:
                    System.out.println("Depósito");
                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
            }
        }
    }
}

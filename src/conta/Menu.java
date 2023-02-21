package conta;

import conta.util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        while (true) {
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
                              +"*****************************************************");
            System.out.println("\n                     Banco de Duloc                ");
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
            System.out.println("ENTRE COM A OPÇÃO:                                   "+ Cores.TEXT_RESET);
            //System.out.println("                                                     "+ Cores.TEXT_RESET);

            opcao = sc.nextInt();

            if (opcao == 9) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nObrigado por usar o Banco de Duloc!");
                sc.close();//Fecha o Scanner (evita erros)
                System.exit(0);//Fecha o programa corretamente
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Criar conta\n\n");
                    break;

                case 2:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Listar todas as contas\n\n");
                    break;

                case 3:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Consultar dados da conta por número\n\n");
                    break;

                case 4:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Atualizar dados da conta\n\n");
                    break;

                case 5:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Apagar conta");
                    break;

                case 6:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Saque\n\n");
                    break;

                case 8:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "Depósito");
                    break;

                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
            }
        }
    }
}

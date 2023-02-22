package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        //Teste da Classe Conta
        Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
        c1.visualizar();
        c1.sacar(12000.0f);
        c1.visualizar();
        c1.depositar(5000.0f);
        c1.visualizar();

        //Teste da Classe Conta Corrente
        ContaCorrente cc1 = new ContaCorrente(2,123,1,"Mariana",15000.0f,1000.0f);
        cc1.visualizar();
        cc1.sacar(12000.0f);
        cc1.visualizar();
        cc1.depositar(5000.0f);
        cc1.visualizar();

        //Teste da Classe Conta Poupança
        ContaPoupanca cp1 = new ContaPoupanca(3,123,2,"Victor",100000.0f,15);
        cp1.visualizar();
        cp1.sacar(1000.0f);
        cp1.visualizar();
        cp1.depositar(5000.0f);
        cp1.visualizar();


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

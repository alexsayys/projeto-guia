package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
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
            System.out.println("                9 - SAIR                             ");
            System.out.println("\n***************************************************");
            System.out.println("ENTRE COM A OPÇÃO:                                   "+ Cores.TEXT_RESET);
            //System.out.println("                                                     "+ Cores.TEXT_RESET);

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                sc.nextLine();
                opcao = 0;
            }

            if (opcao == 9) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nObrigado por usar o Banco de Duloc!");
                sc.close();//Fecha o Scanner (evita erros)
                System.exit(0);//Fecha o programa corretamente
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nCriar conta");
                    keyPress();
                    break;

                case 2:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nListar todas as contas");
                    keyPress();
                    break;

                case 3:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nConsultar dados da conta por número");
                    keyPress();
                    break;

                case 4:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nAtualizar dados da conta");
                    keyPress();
                    break;

                case 5:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nApagar conta");
                    keyPress();
                    break;

                case 6:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nSacar");
                    keyPress();
                    break;

                case 7:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nDepósitar");
                    keyPress();
                    break;
                case 8:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nTransferir");

                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!" + Cores.TEXT_RESET);
                    keyPress();
                    break;
            }
        }
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}

package conta;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ContaController contas = new ContaController();

        Scanner sc = new Scanner(System.in);

        int opcao, numero, agencia, tipo, aniversario;
        String titular;
        float saldo, limite;

        System.out.println("\nCriar contas\n");

        ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(),123,1,"João da Silva", 1000f, 100.0f);
        contas.cadastrar(cc1);
        ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124,1,"Maria da Silva", 2000f,100.0f);
        contas.cadastrar(cc2);
        ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(),125,2,"Mariana dos Santos",4000f,12);
        contas.cadastrar(cp1);
        ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(),125,2,"Juliana Ramos",8000f,15);
        contas.cadastrar(cp2);

        contas.listarTodas();

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

                    System.out.println("\nDigite o número da agência: ");
                    agencia = sc.nextInt();
                    System.out.println("\nDigite o nome do titular: ");
                    sc.skip("\\R?");
                    titular = sc.nextLine();

                    do {

                        System.out.println("Digite o tipo da conta (1-cc ou 2-cp): ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.println("\nDigite o saldo da conta (R$): ");
                    saldo = sc.nextFloat();

                    switch (tipo) {

                        case 1 -> {

                            System.out.println("\nDigite o limite de crédito (R$): ");
                            limite = sc.nextFloat();
                            contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
                        }
                        case 2 -> {

                            System.out.println("\nDigite o aniversário da conta: ");
                            aniversario = sc.nextInt();
                            contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
                        }
                    }
                    keyPress();
                    break;

                case 2:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nListar todas as contas");
                    contas.listarTodas();
                    keyPress();
                    break;

                case 3:

                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nConsultar dados da conta por número");

                    System.out.println("\nDigite o número da conta: ");
                    numero = sc.nextInt();

                    contas.procurarPorNumero(numero);

                    keyPress();
                    break;

                case 4:
                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nAtualizar dados da conta");

                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextInt();

                    if (contas.buscarNaCollection(numero) != null) {

                        System.out.println("\nDigite o número da agência: ");
                        agencia = sc.nextInt();

                        System.out.println("\nDigite o nome do titular: ");
                        sc.skip("\\R?");
                        titular = sc.nextLine();

                        System.out.println("\nDigite o saldo da conta (R$): ");
                        saldo = sc.nextFloat();

                        tipo = contas.retornaTipo(numero);

                        switch (tipo) {

                            case 1 -> {

                                System.out.println("\nDigite o limite de crédito: ");
                                limite = sc.nextFloat();
                                contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
                            }
                            case 2 -> {

                                System.out.println("\nDigite o dia do aniversário da conta: ");
                                aniversario = sc.nextInt();
                                contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
                            }
                            default -> {

                                System.out.println("\nTipo de conta inválido!");
                            }
                        }

                    }

                    keyPress();
                    break;

                case 5:

                    System.out.println(Cores.TEXT_PURPLE_BOLD + "\nApagar conta");

                    System.out.println("\nDigite o número da conta: ");
                    numero = sc.nextInt();

                    contas.deletar(numero);

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

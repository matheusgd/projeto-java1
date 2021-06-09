package curso.java.lanchonete.basico;

import java.util.Scanner;

public class MenuLanchonete {

    public static void main(String[] args) {

        String nome;
        int i = 0;

        double bebida = 0;
        double pizza = 0;
        double hamburgue = 0;
        double batata = 0;
        double borda = 0;
        double resultado = 0;

        Scanner op = new Scanner(System.in);
        Scanner nm = new Scanner(System.in);

        System.out.print("Digite o seu Nome: ");
        nome = nm.nextLine();

        System.out.println("======= BeM Vindo " + nome + " =======");

        do {
            System.out.println("\n");
            System.out.println("|1 - Bebidas    |");
            System.out.println("|2 - Pizzas     |");
            System.out.println("|3 - Hamburgues |");
            System.out.println("|4 - Batatas    |");
            System.out.println("|0 - SAIR       |");
            System.out.print("Digite um valor: ");
            i = op.nextInt();

            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 0) {
                switch (i) {
                    case 1:
                        System.out.println("\n");
                        System.out.println(">5 - Coca Cola      R$ 2,59<");
                        System.out.println(">6 - Guaraná        R$ 2,44<");
                        System.out.println(">7 - Fanta          R$ 2,35<");
                        System.out.println(">8 - Pepsi          R$ 2,05<");
                        System.out.print("Escolha sua bebida: ");
                        i = op.nextInt();

                        switch (i) {
                            case 5:
                                bebida = 2.59;
                                break;
                            case 6:
                                bebida = 2.44;
                                break;
                            case 7:
                                bebida = 2.35;
                                break;
                            case 8:
                                bebida = 2.05;
                                break;
                            default:
                                System.out.println("Valor inválido!");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println(">5 - Calabresa                  R$ 17,90");
                        System.out.println(">6 - Frango com Catupiri        R$ 19,90");
                        System.out.println(">7 - Frango com Bacon           R$ 20,50");
                        System.out.println(">8 - Portuguesa                 R$ 20,55");
                        System.out.print("Escolha sua pizza: ");
                        i = op.nextInt();

                        switch (i) {
                            case 5:
                                System.out.print(">Deseja adicionar borda? [0 = NÃO, 1 = SIM] ");
                                i = op.nextInt();
                                pizza = 17.90;

                                if (i == 1) {
                                    borda = 3.00;
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                System.out.print(">Deseja adicionar borda? [0 = NÃO, 1 = SIM] ");
                                i = op.nextInt();
                                pizza = 19.90;
                                if (i == 1) {
                                    borda = 3.00;
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                System.out.print(">Deseja adicionar borda? [0 = NÃO, 1 = SIM] ");
                                i = op.nextInt();
                                pizza = 20.50;
                                if (i == 1) {
                                    borda = 3.00;
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                System.out.print(">Deseja adicionar borda? [0 = NÃO, 1 = SIM] ");
                                i = op.nextInt();
                                pizza = 20.55;
                                if (i == 1) {
                                    borda = 3.00;
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                System.out.println("Valor inválido!");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println(">5 - X-Tudo         R$ 10,50");
                        System.out.println(">6 - X-Salada       R$ 8,50");
                        System.out.println(">7 - X-Calabresa    R$ 9,50");
                        System.out.println(">8 - X-Fome Zero    R$ 12,90");
                        System.out.print("Escolha seu Hamburguer: ");
                        i = op.nextInt();
                        switch (i) {
                            case 5:
                                hamburgue = 10.50;
                                break;
                            case 6:
                                hamburgue = 8.50;
                                break;
                            case 7:
                                hamburgue = 9.50;
                                break;
                            case 8:
                                hamburgue = 12.50;
                                break;
                            default:
                                System.out.println("Valor inválido!");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("\n");
                        System.out.println(">5 - Batata Frita       R$ 10,50");
                        System.out.println(">6 - Batata Assada      R$ 7,45");
                        System.out.println(">7 - Batata Doce        R$ 8,20");
                        System.out.println(">8 - Batata com bacon   R$ 15,45");
                        System.out.print("Escolha sua batata: ");
                        i = op.nextInt();
                        switch (i) {
                            case 5:
                                batata = 10.50;
                                break;
                            case 6:
                                batata = 7.45;
                                break;
                            case 7:
                                batata = 8.20;
                                break;
                            case 8:
                                batata = 15.45;
                                break;
                            default:
                                System.out.println("Valor inválido!");
                                break;
                        }
                        break;
                    case 0:
                        resultado = bebida + pizza + borda + hamburgue + batata;

                        if (resultado > 0) {
                            System.out.println("Sua conta deu: R$" + resultado + ", pague no caixa");
                            System.out.println("Obrigado por usar nosso sistema!");
                        } else {
                            System.out.println("Obrigado por usar nosso sistema!");
                        }
                        break;
                }
            } else {
                System.out.println("Valor inválido, digite novamente!");
            }

        } while (i != 0);

    }

}

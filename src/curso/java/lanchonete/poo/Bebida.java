package curso.java.lanchonete.poo;

import java.util.Scanner;

public class Bebida {

    public Bebida() {

        Menu i = new Menu();
        Scanner it = new Scanner(System.in);

        System.out.println(">5 - Coca-Cola      R$ 5.00");
        System.out.println(">6 - Guaraná        R$ 4.50");
        System.out.println(">7 - Fanta          R$ 4.10");
        System.out.println(">8 - Pepsi          R$ 4.00");
        System.out.println("Escolha uma bebida: ");
        i.setI(it.nextInt());

        switch (i.getI()) {
            case 5:
                //setBebida(5.00);
            case 6:
                //bebida.setBebida(4.50);
            case 7:
                //bebida.setBebida(4.10);
            case 8:
                //bebida.setBebida(4.00);
            default:
                System.out.println("Valor inválido");
        }

    }

}

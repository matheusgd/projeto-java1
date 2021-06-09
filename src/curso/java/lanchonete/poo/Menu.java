package curso.java.lanchonete.poo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private int i;
    private String nome;
    private Date date;

    public Menu() {

        Scanner nm = new Scanner(System.in);
        Scanner it = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        this.nome = nm.nextLine();

        System.out.println("1 - Bebibdas");
        System.out.println("2 - Pizzas");
        System.out.println("3 - Hamburguers");
        System.out.println("0 - SAIR");
        System.out.print("Digite um valor: ");
        this.i = it.nextInt();
        System.out.println(getDateTime());



    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}

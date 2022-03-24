package curso.java.lanchonete.poo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//a
public class Menu {

    private int i;
    private String nome;
    private Date date;

    private double bebida = 0;

    public Menu() {
    }

    public String listarMenu(){

        Scanner nm = new Scanner(System.in);
        Scanner it = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        setNome(nm.nextLine());

        System.out.println("1 - Bebidas");
        System.out.println("2 - Pizzas");
        System.out.println("3 - Hamburguers");
        System.out.println("0 - SAIR");
        System.out.print("Digite um valor: ");
        setI(it.nextInt());
        System.out.println(getDateTime()); // Data e hora
        System.out.println("\n");

        switch (getI()) {
            case 1 -> {
                Bebida bebi = new Bebida();
                System.out.println(bebi);
            }
            case 2 -> System.out.println("Opção 2");
        }

        return getNome();
    }

    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBebida() {
        return bebida;
    }
    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}

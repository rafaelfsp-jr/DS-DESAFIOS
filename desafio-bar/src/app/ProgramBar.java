package src.app;

import java.util.*;
import src.entities.Bill;

public class ProgramBar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)) {

            Bill bill = new Bill();

            System.out.print("Sexo: ");
            bill.gender = sc.next().charAt(0);
            System.out.print("Quantidade de cervejas: ");
            bill.beer = sc.nextInt();   
            System.out.print("Quantidade de refrigerantes: ");
            bill.softDrink = sc.nextInt();

        }
    }
}

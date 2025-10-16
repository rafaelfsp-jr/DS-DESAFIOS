

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite os dados do primeiro campeão: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Vida inicial: ");
            int life = sc.nextInt();
            System.out.print("Ataque: ");
            int attack = sc.nextInt();
            System.out.print("Armadura: ");
            int armor =  sc.nextInt();



            System.out.println("\nDigite os dados do segundo campeão: ");
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Vida inicial: ");
            life = sc.nextInt();
            System.out.print("Ataque: ");
            attack = sc.nextInt();
            System.out.print("Armadura: ");
            armor =  sc.nextInt();
        }
    }
}

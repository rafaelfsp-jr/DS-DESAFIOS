package application;

import entities.Champion;
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
            Champion champ1 = new Champion(name, life, attack, armor);


            System.out.println("\nDigite os dados do segundo campeão: ");
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Vida inicial: ");
            life = sc.nextInt();
            System.out.print("Ataque: ");
            attack = sc.nextInt();
            System.out.print("Armadura: ");
            armor =  sc.nextInt();
            Champion champ2 = new Champion(name, life, attack, armor);

            System.out.print("\nQuantos turnos você deseja executar? ");
            int turns = sc.nextInt();

            for (int i = 1; i <= turns; i++) {
                champ1.takeDamage(champ2);
                champ2.takeDamage(champ1);

                System.out.println("\nResultado do turno " + i + ":");
                System.out.println(champ1.status());
                System.out.println(champ2.status());

                if(champ1.getLife() == 0 || champ2.getLife() == 0) {
                    break;
                }
            }

            System.out.println("\nFIM DO COMBATE!");

        }
    }
}
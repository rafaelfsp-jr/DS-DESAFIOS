package app;

import entities.TaxPayer;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            List<TaxPayer> list = new ArrayList<>();

            System.out.print("Quantos contribuintes você vai digitar? ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.printf("\nDigite os dados do %do contribuinte:\n", i + 1);
                System.out.print("Renda anual com salário: ");
                double salary = sc.nextDouble();
                System.out.print("Renda anual com prestação de serviço: ");
                double service = sc.nextDouble();
                System.out.print("Renda anual com ganho de capital: ");
                double capital = sc.nextDouble();
                System.out.print("Gastos médicos: ");
                double health = sc.nextDouble();
                System.out.print("Gastos educacionais: ");
                double education = sc.nextDouble();

                TaxPayer taxpayer = new TaxPayer(salary, service, capital, health, education);
                list.add(taxpayer);
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.printf("\nResumo do %do contribuinte:\n", i + 1);
                System.out.printf("Imposto bruto total: %.2f\n", list.get(i).grossTax());
                System.out.printf("Abatimento: %.2f\n", list.get(i).taxRebate());
                System.out.printf("Imposto devido: %.2f\n", list.get(i).netTax());
            }

        }
    }
}

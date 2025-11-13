package entities;

public class TaxPayer {
    
    private final double salaryIncome;
    private final double serviceIncome;
    private final double capitalIncome;
    private final double healthSpending;
    private final double educationSpending;

    public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending, 
            double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double getSalaryIncome() {
        return salaryIncome;
    }

    public double getServiceIncome() {
        return serviceIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public double salaryTax() {
        double monthlyIncome = salaryIncome / 12; 
        if (monthlyIncome < 3000.00) {
            return 0.00;
        } else if (monthlyIncome < 5000.00) {
            return salaryIncome * 0.10;
        } else {
            return salaryIncome * 0.20;
        }
    }

    public double serviceTax() {
        if (serviceIncome <= 0.00) {
            return 0.00;
        } else {
            return serviceIncome * 0.15;
        }
    }

    public double capitalTax() {
        if (capitalIncome <= 0.00) {
            return 0.00;
        } else {
            return capitalIncome * 0.20;
        }
    }

    public double grossTax() {
        return salaryTax() + serviceTax() + capitalTax();
    }

    public double taxRebate() {
        double expenses = healthSpending + educationSpending;
        double refundLimit = grossTax() * 0.30;
        if (expenses < refundLimit) {
            return expenses;
        } else {
            return refundLimit;
        }
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

}
